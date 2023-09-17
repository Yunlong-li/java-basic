package org.example.jihe;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 栈的学习
 * @date 2023-09-05 23:41:31
 */
public class DequeLearning {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(6);
        System.out.println(deque.toString());
        deque.add(8);
        System.out.println(deque.toString());
        deque.push(10);
        System.out.println(deque.toString());
        System.out.println(deque.remove());
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
