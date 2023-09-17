package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: map
 * @date 2023-08-25 16:44:42
 */
public class MapTest {
    public static void mapMethod(){
        Map<Object, String> map = new HashMap<Object, String>();
        map.put("ename", "刘伟");
        map.put("employeddId","232915");
        System.out.println(String.valueOf(map));
        System.out.println(map.get("ename"));
    }

    public static void main(String[] args) {
        mapMethod();
    }
}
