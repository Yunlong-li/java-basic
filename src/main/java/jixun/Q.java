package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 第几天
 * @date 2023-09-11 16:21:57
 */
public class Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next(); // 2006/3/12
            String[] split = s.split("/");
            String year = split[0];
            String month = split[1];
            String day = split[2];
            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int iMonth = Integer.parseInt(month);
            int dayth = 0;
            for (int i = 0; i < iMonth - 1; i++) {
                dayth += days[i];
            }
            dayth += Integer.parseInt(day);

            int iYear = Integer.parseInt(year);
            if((iYear%4==0&&iYear%100!=0)||(iYear%400==0)){
                if (iMonth > 2) {
                    dayth+=1;
                }
            }
            System.out.println(dayth);
        }
    }
}
