package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 偶数求和
 * @date 2023-09-13 16:49:53
 */
public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = 0;
            int sum = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                t += 2;
                sum += t;
                cnt++;
                if (cnt == m) {
                    System.out.print(sum / cnt + " ");
                    cnt = 0;
                    sum = 0;
                }
            }
            if(cnt!=0){
                System.out.println(sum/cnt);
            }else{
                System.out.println();
            }
        }
    }
}
