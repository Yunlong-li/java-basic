package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: A+B
 * @date 2023-09-13 13:47:56
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
