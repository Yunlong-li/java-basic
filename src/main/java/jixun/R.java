package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 首字母变大写
 * @date 2023-09-11 17:00:28
 */
public class R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] words = s.split(" ");
            for(int i=0;i<words.length;i++) {
                char c = words[i].charAt(0);
                char c1 = Character.toUpperCase(c);
                String newWord = c1 + words[i].substring(1);
                System.out.println(newWord);
                if (i != words.length - 1) {
                    System.out.println(" ");
                }
            }
            System.out.println();
//            System.out.println(String.join(" ", words));
        }
    }
}
