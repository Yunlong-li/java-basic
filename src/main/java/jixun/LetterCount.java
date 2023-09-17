package jixun;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 字频统计 hello world
 * @date 2023-09-12 14:58:05
 */
public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isLetter(c)){
                continue;
            }
            if(!counts.containsKey(c)) {
                counts.put(c, 1);
            }else{
                counts.put(c, counts.get(c)+1);
            }
        }
        Set<Map.Entry<Character,Integer>> set = counts.entrySet();
        for(Map.Entry<Character, Integer> entry : set){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
