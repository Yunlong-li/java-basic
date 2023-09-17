package jixun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 统计元音
 * @date 2023-09-13 16:21:45
 */
public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> map = new HashMap<>();
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                switch (str.charAt(j)) {
                    case 'a':
                        map.put('a', map.getOrDefault('a', 0) + 1);
                        break;
                    case 'e':
                        map.put('e', map.getOrDefault('e', 0) + 1);
                        break;
                    case 'i':
                        map.put('i', map.getOrDefault('i', 0) + 1);
                        break;
                    case 'o':
                        map.put('o', map.getOrDefault('o', 0) + 1);
                        break;
                    case 'u':
                        map.put('u', map.getOrDefault('u', 0) + 1);
                        break;
                    default:
                        break;
                }
            }
            Set<Map.Entry<Character, Integer>> set = map.entrySet();
            for (Map.Entry<Character, Integer> entry : set) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
            System.out.println();
        }
    }
}
