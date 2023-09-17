package jixun;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 键值对排序
 * 输入
 *
 * 3
 * 0
 * fang 90
 * yang 50
 * ning 70
 * 输出
 *
 * fang 90
 * ning 70
 * yang 50
 * @date 2023-09-12 15:39:05
 */
public class StudentSort{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sortType = scanner.nextInt();
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            Student student = new Student(score, sortType, name);
            students.add(student);
        }
        Collections.sort(students);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}

class Student implements Comparable<Student>{
    private int score;
    private int sortType;
    private String name;

    public Student(int score, int sortType, String name) {
        this.score = score;
        this.sortType = sortType;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public int getSortType() {
        return sortType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ":" + score;
    }

    @Override
    public int compareTo(@NotNull Student stu) {
        if(sortType==0){
            if(this.score<stu.getScore()){
                return 1;
            }
            if(this.score>stu.getScore()){
                return -1;
            }
            return 0;
        }
        if(sortType==1){
            if(this.score<stu.getScore()){
                return -1;
            }
            if(this.score>stu.getScore()){
                return 1;
            }
            return 0;
        }
        return 0;
    }
}
