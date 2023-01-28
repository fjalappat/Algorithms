package com.francis.p1_two_pointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity
 * The time complexity of the above algorithm will be , where ‘N’ is the total number of elements in the given array.
 *
 * Space Complexity
 * The space complexity will also be , as, in the worst case, we will be pushing ‘N’ numbers in the HashTable.
 * **/
public class HashMapSolution {

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
        int[] result = HashMapSolution.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = HashMapSolution.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
}
