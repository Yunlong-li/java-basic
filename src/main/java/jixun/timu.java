package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: timu
 * @date 2023-09-11 16:16:43
 */
public class timu {
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
