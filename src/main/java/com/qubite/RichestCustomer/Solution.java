package com.qubite.RichestCustomer;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
//class Solution {
//    public List<String> fizzBuzz(int n) {
//        int[] array = new int[15];
//        ArrayList<String> answer = new ArrayList();
//        for(int j :array){
//            String i =  (j % 3 ==0 && j % 5 ==0) ? "FizzBuzz" : ((j % 3 =0) ? "Fizz" : (n % 5 ==0) ? "Buzz" : n);
//            answer.add(i);
//        }
//        return answer;
//    }
//}
public class Solution {
    public static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> custWealth = new ArrayList<>();

        for (int[] i : accounts) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            custWealth.add(sum);
        }
        return Collections.max(custWealth);
        // return custWealth.stream().max();

    }
}