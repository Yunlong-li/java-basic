package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 计算两点间的距离
 * @date 2023-09-13 14:01:54
 */
public class C {
    public static void main(String[] args) {
//        System.out.printf("%.2f%n", 0.58888);
//        System.out.printf("%.2f%n", 0.58888);
//        System.out.printf("%.2f%n", 0.58888);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
//            String[] nums = scanner.nextLine().split(" ");
//            double x1 = Double.parseDouble(nums[0]);
//            double y1 = Double.parseDouble(nums[1]);
//            double x2 = Double.parseDouble(nums[2]);
//            double y2 = Double.parseDouble(nums[3]);
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
//            System.out.println(x1+":"+y1+":"+x2+":"+y2);
            double result = Math.pow(Math.pow(x1 - x2,2)+Math.pow(y1 - y2,2),0.5);
            System.out.printf("%.2f%n", result);
        }
    }
}
