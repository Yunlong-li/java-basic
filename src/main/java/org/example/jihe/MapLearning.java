package org.example.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: map学习
 * @date 2023-09-12 14:44:43
 */
public class MapLearning {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(2, "shanghai");
        map.put(1, "ningbo");
        map.put(3, "hangzhou");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
