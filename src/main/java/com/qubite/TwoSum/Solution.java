package com.qubite.TwoSum;

import java.util.ArrayList;
import java.util.HashMap;


//optimized solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap which store the difference and its index.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            // Check if the difference exists in the map
            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i };
            }
            // Store the index of the current number for later comparison.
            map.put(nums[i], i);
        }
        // If no solution found,anyway return null
        return null;
    }
}




//old solution

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        ArrayList<Integer> output = new ArrayList<>();
//        int prevInd =0;
//        int prev =0;
//        for(int i = 0; i <nums.length; i++){
//            if (nums[i] + prev == target){
//                output.add(prevInd);
//                output.add(i);
//                return output.stream().mapToInt( k -> k).toArray();
//            }else {
//                prevInd =i;
//                prev = nums[i];
//            }
//        }
//        return null;
//
//    }
//}