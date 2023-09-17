package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 成绩转换
 * @date 2023-09-13 15:48:50
 */
public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int score = scanner.nextInt();
            if(score>100||score<0) {
                System.out.println("Score is error!");
            }else if(score<60){
                System.out.println("E");
            }else if(score<70){
                System.out.println("D");
            }else if(score<80){
                System.out.println("C");
            }else if(score<90){
                System.out.println("B");
            }else{
                System.out.println("A");
            }
        }
    }
}
