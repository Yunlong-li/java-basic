package org.example.io;

import java.io.*;

/**
 * @author 刘伟
 * @program: test
 * @description: none
 * @date 2023-08-24 22:10:21
 */
public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\io\\example2.txt";
        File file = new File(fileName);

        FileWriter fos = new FileWriter(file);
        String str = "欲穷千里目，更上一层楼";
        fos.write(str);
        fos.close();

        FileReader fis = new FileReader(file);
        char[] bytes2 = new char[1024];
        int len = fis.read(bytes2); // 11
        System.out.println(len);
        System.out.println(new String(bytes2, 0, len));
        fis.close();
    }
}
