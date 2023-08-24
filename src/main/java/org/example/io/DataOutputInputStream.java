package org.example.io;

import java.io.*;

/**
 * @author 刘伟
 * @program: test
 * @description: none
 * @date 2023-08-24 22:46:21
 */
public class DataOutputInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\io\\example4.txt");

        System.out.println(file.getAbsolutePath());

        // 写入
        FileOutputStream out = new FileOutputStream(file);
        DataOutputStream dout = new DataOutputStream(out);
        dout.writeUTF("使用writeUTF()方法写入数据");
        dout.writeInt(298);
        dout.writeDouble(1.23);
        dout.writeBoolean(true);
        dout.close();
        out.close();


        // 读出
        FileInputStream in = new FileInputStream(file);
        DataInputStream din = new DataInputStream(in);
        System.out.println(din.readUTF());
        System.out.println(din.readInt());
        System.out.println(din.readDouble());
        System.out.println(din.readBoolean());
        din.close();
        in.close();
    }
}
