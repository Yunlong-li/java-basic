package jixun;

import org.apache.bcel.classfile.LineNumberTable;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 数据的交换输出
 * @date 2023-09-11 17:14:40
 */
public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if(n==0)break;
            int[] a = new int[n];
            a[0] = scanner.nextInt();
            int minVal = a[0];
            int minIdx = 0;
            for (int i = 1; i < n; i++) {
                a[i] = scanner.nextInt();
                if(a[i]<minVal){
                    minVal=a[i];
                    minIdx=i;
                }
            }
            int t = a[0];
            a[0]=minVal;
            a[minIdx]=t;
            for (int p : a) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

