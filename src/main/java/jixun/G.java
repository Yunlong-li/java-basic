package jixun;

import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 求奇数的乘积
 * @date 2023-09-13 15:01:50
 */
public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int res = 1;
            String[] line = scanner.nextLine().split(" ");
            for(int i=1;i<line.length;i++) {
                int t = Integer.parseInt(line[i]);
                if(t%2==1){
                    res*=t;
                }
            }
            System.out.println(res);
        }
    }
}
