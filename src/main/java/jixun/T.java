package jixun;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            int N = scanner.nextInt();
            int C = scanner.nextInt();
            if (N == 0) break;
            cnt++;

            // Read and sort data in chunks
            int chunkSize = 1000; // Adjust the chunk size as needed
            for (int i = 0; i < N; i += chunkSize) {
                int end = Math.min(i + chunkSize, N);
                Stu[] stus = new Stu[end - i];
                for (int j = i; j < end; j++) {
                    String sno = scanner.next();
                    String sname = scanner.next();
                    byte score = scanner.nextByte();
                    stus[j - i] = new Stu(sno, sname, score);
                }

                if (C == 1) {
                    Arrays.sort(stus, Comparator.comparing(Stu::getSno));
                } else if (C == 2) {
                    Arrays.sort(stus, Comparator.comparing(Stu::getSname).thenComparing(Stu::getSno));
                } else {
                    Arrays.sort(stus, Comparator.comparing(Stu::getScore).thenComparing(Stu::getSno));
                }

                System.out.println("Case " + cnt + ":");
                for (Stu s : stus) {
                    System.out.println(s.toString());
                }
            }
        }
    }
}

class Stu {
    private String sno;
    private String sname;
    private byte score;

    public Stu(String sno, String sname, byte score) {
        this.sno = sno;
        this.sname = sname;
        this.score = score;
    }

    public String getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    public byte getScore() {
        return score;
    }

    @Override
    public String toString() {
        return sno + " " + sname + " " + score;
    }
}


//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
///**
// * @author 刘伟
// * @program: java-basic
// * @description: EXCEL排序
// * @date 2023-09-13 20:48:18
// */
//public class T {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        Comparator<Stu> comBySno = Comparator.comparing(Stu::getSno);
////        Comparator<Stu> comBySname = Comparator.comparing(Stu::getSname);
////        Comparator<Stu> comByScore = Comparator.comparing(Stu::getScore);
////        int cnt = 0;
////        while(true) {
////            int N = scanner.nextInt();
////            int C = scanner.nextInt();
////            if (N == 0) break;
////            cnt++;
////            Stu[] stus = new Stu[N];
////            for(int i = 0; i <N; i++) {
////                String sno = scanner.next();
////                String sname = scanner.next();
////                byte score = scanner.nextByte();
////                stus[i] = new Stu(sno, sname, score);
////            }
////            PriorityQueue<Stu> queue;
////            if(C==1){
////                queue = new PriorityQueue<>(comBySno);
////            }else if(C==2){
////                queue = new PriorityQueue<>(comBySname.thenComparing(comBySno));
////            }else{
////                queue = new PriorityQueue<>(comByScore.thenComparing(comBySno));
////            }
////            for(Stu s : stus){
////                queue.add(s);
////            }
////            Stu temp;
////            while((temp=queue.poll()) != null){
////                System.out.println(temp.toString());
////            }
////        }
////    }
//
//
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        Comparator<Stu> comBySno = Comparator.comparing(Stu::getSno);
////        Comparator<Stu> comBySname = Comparator.comparing(Stu::getSname);
////        Comparator<Stu> comByScore = Comparator.comparing(Stu::getScore);
////        int cnt = 0;
////        while(true) {
////            int N = scanner.nextInt(); // 记录数
////            int C = scanner.nextInt(); // 序号
////            if (N == 0) break;
////            cnt++;
////            Stu[] stus = new Stu[N];
////            for(int i = 0; i <N; i++) {
////                String sno = scanner.next();
////                String sname = scanner.next();
////                byte score = scanner.nextByte();
////                stus[i] = new Stu(sno, sname, score);
//////                System.out.println(sno+":"+sname+":"+score);
////            }
////            if(C==1){
////                Arrays.sort(stus, comBySno);
////            }else if(C==2){
////                Arrays.sort(stus, comBySname.thenComparing(comBySno));
////            }else{
////                Arrays.sort(stus, comByScore.thenComparing(comBySno));
////            }
////            System.out.println("Case "+cnt+":");
////            for(Stu s : stus){
////                System.out.println(s.toString());
////            }
////        }
////
////    }
//
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        Comparator<Stu> comBySno = Comparator.comparing(Stu::getSno);
////        Comparator<Stu> comBySname = Comparator.comparing(Stu::getSname);
////        Comparator<Stu> comByScore = Comparator.comparing(Stu::getScore);
////        int cnt = 0;
////        while(true) {
////            int N = scanner.nextInt();
////            int C = scanner.nextInt();
////            if (N == 0) break;
////            cnt++;
//////            Stu[] stus = new Stu[N];
////
////            PriorityQueue<Stu> queue;
////            if(C==1){
////                queue = new PriorityQueue<>(comBySno);
////            }else if(C==2){
////                queue = new PriorityQueue<>(comBySname.thenComparing(comBySno));
////            }else{
////                queue = new PriorityQueue<>(comByScore.thenComparing(comBySno));
////            }
////            for(int i = 0; i <N; i++) {
////                String sno = scanner.next();
////                String sname = scanner.next();
////                byte score = scanner.nextByte();
//////                stus[i] = ;
////                queue.add(new Stu(sno, sname, score));
////            }
//////            for(Stu s : stus){
//////                queue.add(s);
//////            }
////            Stu temp;
////            while((temp=queue.poll()) != null){
////                System.out.println(temp.toString());
////            }
////        }
////    }
//}
////class Stu implements Comparable<Stu> {
//class Stu {
//    private String sno;
//    private String sname;
//    private byte score;
//
//    public Stu(String sno, String sname, byte score) {
//        this.sno = sno;
//        this.sname = sname;
//        this.score = score;
//    }
//
//    public String getSno() {
//        return sno;
//    }
//
//    public String getSname() {
//        return sname;
//    }
//
//    public byte getScore() {
//        return score;
//    }
//
////    @Override
////    public int compareTo(@NotNull Stu s) {
////
////        return 0;
////    }
//
//    @Override
//    public String toString() {
//        return sno+" "+sname+" "+score;
//    }
//}
