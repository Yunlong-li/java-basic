package jixun;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: HJ9牛客
 * @date 2023-09-12 14:07:14
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Set<Character> set = new LinkedHashSet<Character>();
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            set.add(c);
        }
        for(char c : set){
            System.out.print(c);
        }
        System.out.println();
    }
}

//'9876673'
//37689