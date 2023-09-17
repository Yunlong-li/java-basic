package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 求绝对值
 * @date 2023-09-11 16:57:11
 */
public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            double d = scanner.nextDouble();
            d = Math.abs(d);
            String s = String.format("%.2f", d);
            System.out.println(s);
        }
    }
}
