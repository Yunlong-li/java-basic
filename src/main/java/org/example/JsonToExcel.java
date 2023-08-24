//package org.example;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Iterator;
//
//public class JsonToExcel {
//    public static void main(String[] args) throws IOException {
//        String json = "{\"name\":\"liuwei\",\"family\":{\"1\":\"dad\",\"2\":\"mom\"},\"others\":[]}";
//        String fileName = "output.xlsx";
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode rootNode = objectMapper.readTree(json);
//
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Data");
//
//        int rowNumber = 0;
//        rowNumber = writeJsonNode(rootNode, sheet, rowNumber);
//
//        FileOutputStream outputStream = new FileOutputStream(new File(fileName));
//        workbook.write(outputStream);
//        workbook.close();
//        outputStream.close();
//
//        System.out.println("Excel file generated successfully!");
//    }
//
//    private static int writeJsonNode(JsonNode node, Sheet sheet, int rowNumber) {
//        if (node.isObject()) {
//            // Write object fields as column headers
//            Row headerRow = sheet.createRow(rowNumber++);
//            int colNumber = 0;
//            Iterator<String> fieldNames = node.fieldNames();
//            while (fieldNames.hasNext()) {
//                String fieldName = fieldNames.next();
//                Cell cell = headerRow.createCell(colNumber++);
//                cell.setCellValue(fieldName);
//            }
//            // Write object values as rows
//            Row dataRow = sheet.createRow(rowNumber++);
//            colNumber = 0;
//            Iterator<JsonNode> fieldValues = node.elements();
//            while (fieldValues.hasNext()) {
//                JsonNode fieldValue = fieldValues.next();
//                colNumber = writeJsonNode(fieldValue, sheet, colNumber, dataRow);
//            }
//        } else if (node.isArray()) {
//            // Write array values as rows
//            Iterator<JsonNode> elements = node.elements();
//            while (elements.hasNext()) {
//                JsonNode element = elements.next();
//                rowNumber = writeJsonNode(element, sheet, rowNumber);
//            }
//        } else {
//            // Write scalar value as a cell
//            Row dataRow = sheet.createRow(rowNumber++);
//            Cell cell = dataRow.createCell(0);
//            if (node.isTextual()) {
//                cell.setCellValue(node.asText());
//            } else if (node.isBoolean()) {
//                cell.setCellValue(node.asBoolean());
//            } else if (node.isNumber()) {
//                cell.setCellValue(node.asDouble());
//            } else {
//                cell.setCellValue(node.toString());
//            }
//        }
//        return rowNumber;
//    }
//
//    private static int writeJsonNode(JsonNode node, Sheet sheet, int colNumber, Row dataRow) {
//        Cell cell = dataRow.createCell(colNumber++);
//        if (node.isTextual()) {
//            cell.setCellValue(node.asText());
//        } else if (node.isBoolean()) {
//            cell.setCellValue(node.asBoolean());
//        } else if (node.isNumber()) {
//            cell.setCellValue(node.asDouble());
//        } else {
//            cell.setCellValue(node.toString());
//        }
//        return colNumber;
//    }
//}