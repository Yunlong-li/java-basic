package org.example.jihe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: list学习
 * @date 2023-09-05 23:22:16
 */
public class ListLearning {
    public void arrayListLearning(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(list.size() - 1);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ListLearning l = new ListLearning();
        l.arrayListLearning();


        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(6);
        l1.add(3);
        l1.add(1);
        l1.add(4);
        l1.add(8);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1,6));
        Collections.reverse(l1);
        Collections.fill(l1, 8);
        System.out.println(l1);
    }
}
