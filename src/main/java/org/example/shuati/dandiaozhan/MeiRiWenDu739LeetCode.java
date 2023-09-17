package org.example.shuati.dandiaozhan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 单调栈：每日温度，力扣739
 * @date 2023-09-05 23:07:59
 */
public class MeiRiWenDu739LeetCode {
    /**
    * @Description: 使用List
    * @Param:
    * @return:
    * @Date: 2023/9/5
    */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        List<Integer> st = new LinkedList<>();
        st.add(0);
        for(int i=0;i<temperatures.length;i++){
            if(temperatures[i]<=temperatures[st.get(st.size()-1)]){
                st.add(i);
            }else{
                while(!st.isEmpty()&&temperatures[i]>temperatures[st.get(st.size()-1)]){
                    result[st.get(st.size()-1)]=i-st.get(st.size()-1);
                    st.remove(st.size()-1);
                }
                st.add(i);
            }
        }
        return result;
    }

    /**
     * @Description: 使用Deque
     * @Param:
     * @return:
     * @Date: 2023/9/5
     */
    public int[] dailyTemperatures2(int[] temperatures) throws NullPointerException{
        int len = temperatures.length;
        int[] res = new int[len];
        Deque<Integer> st = new LinkedList<>();
        for(int i=0;i<len;i++){
            if(temperatures[i]<=temperatures[st.peek()]){
                st.push(i);
            }else{
                while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                    res[st.peek()]=i-st.pop();
                }
                st.push(i);
            }
        }
        return res;
    }

    /**
     * @Description: 简约版本
     * @Param:
     * @return:
     * @Date: 2023/9/5
     */
    public int[] dailyTemperatures3(int[] temperatures) throws NullPointerException{
        int[] result = new int[temperatures.length];
        Deque<Integer> st = new LinkedList<>();
        st.push(0);
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                result[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        MeiRiWenDu739LeetCode code = new MeiRiWenDu739LeetCode();
        int[] temperatures = {73,74,75,71,69,72,76,73};
//        int[] result = code.dailyTemperatures(temperatures);
        int[] result = code.dailyTemperatures3(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
