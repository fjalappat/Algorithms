package com.francis.p1_two_pointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
 * Example 1:
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 * Example 2:
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 *  Time Complexity
 * The time complexity of the above algorithm will be O(N), where ‘N’ is the total number of elements in the given array.
 * Space Complexity
 * The space complexity will also be O(N), as, in the worst case, we will be pushing ‘N’ numbers in the HashTable.
 * **/
public class TargetSumSol2 {

    public static int[] search(int[] arr, int targetSum) {
        Map<Integer, Integer> arrMap = new HashMap<>(arr.length);
        for(int i=0;i<arr.length;i++){
            int pairInt = targetSum - arr[i];
            if(arrMap.containsKey(pairInt)) {
                return new int[] { i, arrMap.get(pairInt)};
            } else {
                if(!arrMap.containsKey(arr[i])) {
                   arrMap.put(arr[i],i);
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] result = TargetSumSol2.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = TargetSumSol2.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
}
