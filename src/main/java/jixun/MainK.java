package jixun;

/**
 * @author 刘玫佳
 * @program: java-basic
 * @description:
 * @date 2023-09-13 16:44:18
 */
import java.util.Scanner;

public class MainK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = n%m;
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                list[i]=2*(i+1);
            }
            for (int i = 0; i < n/m; i++) {
                int sum = 0;
                for(int j=i*m;j<i*m+m;j++){
                    sum+=list[j];
                }
                if(i!=(int)(n/m)-1){
                    System.out.print(sum/m+" ");
                }
                else{
                    System.out.print(sum/m+ " ");
                }
            }
            if (a==0){
                System.out.println();
            }else{
                int sum1 = 0;
                for (int i = Math.max(n-m,0)+1; i < n; i++) {
                    sum1+=list[i];
                }
                System.out.println(sum1/a);
            }
        }
    }
}

