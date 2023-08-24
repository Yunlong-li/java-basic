package org.example.io;

import java.io.*;
import java.lang.reflect.Field;

/**
 * @author 刘伟
 * @program: test
 * @description: none
 * @date 2023-08-24 21:57:51
 */
public class FileOutputInputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\io\\example.txt";
        File file = new File(fileName);

        FileOutputStream fos = new FileOutputStream(file);
        byte[] bytes1 = "白日依山尽，黄河入海流".getBytes();
        System.out.println(bytes1.length); // 33
        fos.write(bytes1);
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        byte[] bytes2 = new byte[1024];
        int len = fis.read(bytes2); // 33
        System.out.println(len);
        System.out.println(new String(bytes2, 0, len));
        fis.close();


    }
}
