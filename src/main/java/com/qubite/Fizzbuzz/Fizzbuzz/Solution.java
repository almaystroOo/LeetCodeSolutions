package com.qubite.RichestCustomer.Fizzbuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        int[] array = new int[15];
        ArrayList<String> answer = new ArrayList();
        for(int j =1;j<=n;j++){
            String i =  (j % 3 ==0 && j % 5 ==0) ? "FizzBuzz" :
                    (j % 3 ==0) ? "Fizz" :
                            (j % 5 ==0) ? "Buzz" :
                                    String.valueOf(j);
            answer.add(i);
        }
        return answer;
    }
}