package org.example;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void dateLearning() {
        //        File file = new File("D:/111/renwu/书籍/");
//        String[] filelist = file.list();
//        for(String cert:filelist){
//            System.out.println(cert);
//        }
        // 创建一个格式化日期时间的对象，指定日期格式为 yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        // 获取当前时间
        Date date = new Date();
        // 将当前时间格式化为指定格式的字符串
        String dateString = formatter.format(date);
        System.out.println("当前时间：" + dateString);
        System.out.println(dateString.length());
    }

    public static void main(String[] args) {
//        dateLearning();
    }
}
