package com.francis.p1_two_pointers;


/**
 * Time Complexity
 * The time complexity of the algorithm will be O(N) where ‘N’ is the total number of elements in the given array.
 *
 * Space Complexity
 * The algorithm runs in constant space O(1).
 * **/
class Solution {
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
        int[] result = Solution.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = Solution.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
}


