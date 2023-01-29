package com.francis.p1_two_pointers;


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
 * Time Complexity
 * The time complexity of the algorithm will be O(N) where ‘N’ is the total number of elements in the given array.
 * Space Complexity
 * The algorithm runs in constant space O(1).
 * **/
class TargetSumSol1 {
    public static int[] search(int[] arr, int targetSum) {
        int min = 0,max= arr.length-1;
        for(int i=0;i<arr.length;i++){
            int actualSum = arr[min] + arr[max];
            System.out.printf("\n Actual sum for co-ordinates [%d,%d] = %d",min,max,actualSum);
            if(targetSum == actualSum){
                System.out.println("\nResult co-ordinates: min="+min+", max="+max);
                return new int[] { min, max };
            } else if(targetSum > actualSum) {
                min++;
            } else {
                max--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] result = TargetSumSol1.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = TargetSumSol1.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");

    }
}


