package jixun;

import java.math.BigDecimal;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: demo1
 * @date 2023-09-11 15:08:00
 */
public class demo1 {
    public static void main(String[] args) {
        double a = 0.11;
        double b = 2021.32;
        System.out.println(a+b);

        BigDecimal a1 = new BigDecimal("0.11");
        BigDecimal b1 = new BigDecimal("2021.32");
        System.out.println(a1.add(b1));
    }
}
