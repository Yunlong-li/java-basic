package org.example;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 接口测试
 * @date 2023-08-25 09:21:48
 */
public class apitest {
//    public static void main(String[] args) throws IOException {
//        File inputFile = new File("D:\\桌面文件\\学习文件\\秋招\\照片\\5寸白底.png");
//
//        // 构建请求 URL
//        String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL
//
//        try {
//            URL url = new URL(apiUrl);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("POST");
//            connection.setDoOutput(true);
//            String boundary = "Boundary-" + System.currentTimeMillis(); // 定义 boundary
//            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
//
//            // 获取输出流，用于写入请求体
//            OutputStream out = connection.getOutputStream();
//
//            // 构建请求体
//            out.write(("--" + boundary + "\r\n").getBytes());
//            out.write(("Content-Disposition: form-data; name=\"file\"; filename=\"" + inputFile.getName() + "\"\r\n").getBytes());
//            out.write(("Content-Type: application/octet-stream\r\n\r\n").getBytes());
//
//            FileInputStream fis = new FileInputStream(inputFile);
//            byte[] buffer = new byte[4096];
//            int bytesRead;
//            while ((bytesRead = fis.read(buffer)) != -1) {
//                out.write(buffer, 0, bytesRead);
//            }
//            fis.close();
//
//            out.write(("\r\n--" + boundary + "--\r\n").getBytes());
//            out.close();
//
//            // 获取响应状态码
//            int responseCode = connection.getResponseCode();
//            System.out.println("Response Code: " + responseCode);
//
//            // 打印响应内容
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            StringBuilder response = new StringBuilder();
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//            System.out.println("Response Content: " + response.toString());
//
//            connection.disconnect();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    public static void main(String[] args) throws IOException {
//        File inputFile = new File("D:\\桌面文件\\学习文件\\秋招\\照片\\5寸白底.png");
//
//        // 构建请求 URL
//        String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL
//
//        OkHttpClient client = new OkHttpClient();
//
//        MediaType mediaType = MediaType.parse("application/octet-stream");
//
//        RequestBody requestBody = new MultipartBody.Builder()
//                .setType(MultipartBody.FORM)
//                .addFormDataPart("file", inputFile.getName(), RequestBody.create(mediaType, inputFile))
//                .build();
//
//        Request request = new Request.Builder()
//                .url(apiUrl)
//                .post(requestBody)
//                .build();
//
//        try (Response response = client.newCall(request).execute()) {
//            if (response.isSuccessful()) {
//                System.out.println("Request successful!");
//                System.out.println("Response Code: " + response.code());
//                System.out.println("Response Body: " + response.body().string());
//            } else {
//                System.out.println("Request failed! Response Code: " + response.code());
//            }
//        }
//    }


//    public static void main(String[] args) throws IOException {
//        // 网络上的图片 URL
//        String imageUrl = "https://nlp-eb.cdn.bcebos.com/logo/logoErnieBot.png";
//
//        // 构建请求 URL
//        String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL
//
//        OkHttpClient client = new OkHttpClient();
//
//        MediaType mediaType = MediaType.parse("application/octet-stream");
//
//        // 获取网络上的图片流
//        InputStream imageStream = new URL(imageUrl).openStream();
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        byte[] buffer = new byte[1024];
//        int bytesRead;
//        while ((bytesRead = imageStream.read(buffer)) != -1) {
//            byteArrayOutputStream.write(buffer, 0, bytesRead);
//        }
//        byte[] imageBytes = byteArrayOutputStream.toByteArray();
//
//        // 构建请求体，将图片的字节数组添加为请求的一部分
//        RequestBody requestBody = new MultipartBody.Builder()
//                .setType(MultipartBody.FORM)
//                .addFormDataPart("file", "remote_image.png", RequestBody.create(mediaType, imageBytes))
//                .build();
//
//        // 构建请求对象
//        Request request = new Request.Builder()
//                .url(apiUrl)
//                .post(requestBody)
//                .build();
//
//        // 执行请求并获取响应
//        try (Response response = client.newCall(request).execute()) {
//            if (response.isSuccessful()) {
//                System.out.println("Request successful!");
//                System.out.println("Response Code: " + response.code());
//                System.out.println("Response Body: " + response.body().string());
//            } else {
//                System.out.println("Request failed! Response Code: " + response.code());
//            }
//        }
//    }


//    public static void main(String[] args) throws IOException {
//        // 网络上的图片 URL
//        String imageUrl = "https://nlp-eb.cdn.bcebos.com/logo/logoErnieBot.png";
//
//        // 构建请求 URL
//        String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL
//
//        OkHttpClient client = new OkHttpClient();
//
//        MediaType mediaType = MediaType.parse("application/octet-stream");
//
//        // 获取网络上的图片流
//        InputStream imageStream = new URL(imageUrl).openStream();
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        byte[] buffer = new byte[1024];
//        int bytesRead;
//        while ((bytesRead = imageStream.read(buffer)) != -1) {
//            byteArrayOutputStream.write(buffer, 0, bytesRead);
//        }
//        byte[] imageBytes = byteArrayOutputStream.toByteArray();
//
//        RequestBody requestBody = RequestBody.create(mediaType, imageBytes);
//
//        Request request = new Request.Builder()
//                .url(apiUrl)
//                .post(requestBody)
//                .build();
//
//        try (Response response = client.newCall(request).execute()) {
//            if (response.isSuccessful()) {
//                System.out.println("Request successful!");
//                System.out.println("Response Code: " + response.code());
//                System.out.println("Response Body: " + response.body().string());
//            } else {
//                System.out.println("Request failed! Response Code: " + response.code());
//            }
//        }
//    }


//    // 使用原生工具 + jdk1.8
//    public static void main(String[] args) throws IOException {
//        // 网络上的图片 URL
//        String imageUrl = "https://nlp-eb.cdn.bcebos.com/logo/logoErnieBot.png";
//
//        // 构建请求 URL
//        String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL
//
//        // 获取网络上的图片流
//        InputStream imageStream = new URL(imageUrl).openStream();
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        byte[] buffer = new byte[1024];
//        int bytesRead;
//        while ((bytesRead = imageStream.read(buffer)) != -1) {
//            byteArrayOutputStream.write(buffer, 0, bytesRead);
//        }
//        byte[] imageBytes = byteArrayOutputStream.toByteArray();
//
//        // 构建请求体
//        String boundary = "Boundary-" + System.currentTimeMillis(); // 定义 boundary
//        String lineEnding = "\r\n";
//
//        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
//        connection.setRequestMethod("POST");
//        connection.setDoOutput(true);
//        // 设置请求头中的 Content-Type 字段
//        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
//
//        OutputStream out = connection.getOutputStream();
//        PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, "UTF-8"), true);
//
//        // 添加 JSON 数据字段
//        writer.append("--" + boundary).append(lineEnding);
//        writer.append("Content-Disposition: form-data; name=\"json_data\"").append(lineEnding);
//        writer.append("Content-Type: application/json").append(lineEnding);
//        writer.append(lineEnding);
//        // 添加 JSON 数据
//        String jsonData = "{\"ename\": \"刘伟\", \"employeeId\": \"232915\"}";
//        writer.append(jsonData).append(lineEnding);
//        writer.flush();
//
//        // 添加文件字段
//        writer.append("--" + boundary).append(lineEnding);
//        writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"remote_image.png\"").append(lineEnding);
//        writer.append("Content-Type: application/octet-stream").append(lineEnding);
//        writer.append(lineEnding);
//        writer.flush();
//        out.write(imageBytes);
//        out.flush();
//        writer.append(lineEnding);
//        writer.flush();
//
//        // 添加结束分隔线
//        writer.append("--" + boundary + "--").append(lineEnding);
//        writer.close();
//
//        // 获取响应状态码
//        int responseCode = connection.getResponseCode();
//        System.out.println("Response Code: " + responseCode);
//
//        // 读取响应内容
//        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//
//        System.out.println("Response Body: " + response.toString());
//        connection.disconnect();
//    }


    public static void main(String[] args) throws IOException {
        // 网络上的图片 URL
        String imageUrl = "https://nlp-eb.cdn.bcebos.com/logo/logoErnieBot.png";

        // 构建请求 URL
        String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL

        // 获取网络上的图片流
        InputStream imageStream = new URL(imageUrl).openStream();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = imageStream.read(buffer)) != -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = byteArrayOutputStream.toByteArray();

        File file = new File("D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\文心一言.png");
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
        }
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(imageBytes);
        outputStream.close();

        // 构建请求体
        String boundary = "Boundary-" + System.currentTimeMillis(); // 定义 boundary
        String lineEnding = "\r\n";

        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

        OutputStream out = connection.getOutputStream();
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, "UTF-8"), true);

        // 添加文件字段
        writer.append("--" + boundary).append(lineEnding);
        writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"remote_image.png\"").append(lineEnding);
        writer.append("Content-Type: application/octet-stream").append(lineEnding);
        writer.append("params: {ename=刘伟}").append(lineEnding);
        writer.append(lineEnding);
        writer.flush();
        out.write(imageBytes);
        out.flush();
        writer.append(lineEnding);
        writer.flush();

        // 添加结束分隔线
        writer.append("--" + boundary + "--").append(lineEnding);
        writer.close();

        // 获取响应状态码
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // 读取响应内容
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println("Response Body: " + response.toString());
        connection.disconnect();
    }

}
