package org.example.io;

import java.io.File;
import java.io.IOException;

/**
 * @author 刘伟
 * @program: test
 * @description: File操作
 * @date 2023-08-24 20:58:26
 */
public class file {
    public static void main(String[] args) throws IOException {

//        方式一
//        String parentPath = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\test\\src\\main\\java\\org\\example\\io\\";
//        String fileName = "example.txt";
//
//        File file = new File(parentPath, fileName);


//        方式二
//        String fileName = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\io\\example.txt";
//        File file = new File(fileName);


//        方式三
        String parentPath = "D:\\桌面文件\\文本\\秋招\\开发\\后端\\java-basic\\src\\main\\java\\org\\example\\io\\";
        String fileName = "example.txt";

        File parentFile = new File(parentPath);
        File file = new File(parentFile, fileName);




        // 方法调用

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.lastModified());


        if(!file.exists()){
            file.createNewFile();
            System.out.println(file.exists());
        }

        System.out.println(file.length()+"B");


    }
}
