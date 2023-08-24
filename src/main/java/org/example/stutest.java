package org.example;

import java.lang.reflect.Field;

/**
 * @author 刘伟
 * @program: test
 * @description: 学生反射测试
 * @date 2023-05-23 18:48:00
 */
public class stutest {
    public static void main(String[] args) throws IllegalAccessException {
        Stu stu = new Stu(null,"李炜");
        Field[] fields = Stu.class.getDeclaredFields();
        for(Field field: fields) {
            field.setAccessible(true);
            Object value = field.get(stu);
            System.out.println(field.getName());
        }
    }
}
