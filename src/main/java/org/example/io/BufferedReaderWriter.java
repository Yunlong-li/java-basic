package org.example.io;

import java.io.*;

/**
 * @author 刘伟
 * @program: test
 * @description: none
 * @date 2023-08-24 22:29:47
 */
public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\test\\src\\main\\java\\org\\example\\io\\example3.txt";

        // 创建文件对象
        File file = new File(fileName);

        // 定义写入的内容
        String[] contents = {"第一行","第二行","第三行"};


        // 写
        // 文件字符输出流
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        for(String str: contents){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        writer.close();

        // 读
        // 文件字符输入流
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader =new BufferedReader(reader);

        String tmp = null;
        while((tmp=bufferedReader.readLine())!=null){
            System.out.println(tmp);
        }

        bufferedWriter.close();
        writer.close();




    }
}
