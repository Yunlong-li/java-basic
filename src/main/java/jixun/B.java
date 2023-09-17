package jixun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: ASCII码排序
 * @date 2023-09-13 13:51:04
 */
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().split("");
            Arrays.sort(words);
            for (String word : words) {
                System.out.print(word+" ");
            }
            System.out.println();
        }
    }
}
