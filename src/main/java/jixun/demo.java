package jixun;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: demo
 * @date 2023-09-11 14:08:22
 */
public class demo {
    public static void main(String[] args) {
        System.out.println((int)1/3);
        System.out.println((int)2/3);
        System.out.println(Math.round((float)1/3));
        System.out.println(Math.round((double)2/3));
        System.out.println((float)1/3);
        System.out.println((double)1/3);
        System.out.println(1/3);
        System.out.println(1/3L);


        String a = new String("nbcb");
        String b = new String("nbcb");
        String c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.getClass().getName());
        a = "6";
        System.out.println(a.getClass().getName());
        System.out.println(a);
        System.out.println(c);
        System.out.println(a==c);
    }
}
