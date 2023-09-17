package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 图片流读入读出测试
 * @date 2023-08-25 09:22:19
 */
public class imgiotest {
    public static void main(String[] args) throws IOException {
//        String fileName = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\io\\example.txt";
//        File file = new File(fileName);
//
//        FileOutputStream fos = new FileOutputStream(file);
//        byte[] bytes1 = "白日依山尽，黄河入海流".getBytes();
//        System.out.println(bytes1.length); // 33
//        fos.write(bytes1);
//        fos.close();
//
//        FileInputStream fis = new FileInputStream(file);
//        byte[] bytes2 = new byte[1024];
//        int len = fis.read(bytes2); // 33
//        System.out.println(len);
//        System.out.println(new String(bytes2, 0, len));
//        fis.close();

        // 输入文件
        File inputFile = new File("D:\\桌面文件\\学习文件\\秋招\\照片\\5寸白底.png");

        FileInputStream fis = new FileInputStream(inputFile);
        byte[] bytes = new byte[(int) inputFile.length()];
        int len = fis.read(bytes);
        System.out.println(len);
        fis.close();


        // 输出文件
        File outputFile = new File("D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\照片流测试.png");
        FileOutputStream fos = new FileOutputStream(outputFile);
        fos.write(bytes, 0, len);
        fos.close();



    }
}
