package com.dsa.problems.arrays;

/**
 * Maximum Subarray Problem (Kadane's Algorithm)
 * 
 * Problem: Given an integer array nums, find the subarray with the largest sum, 
 * and return its sum.
 * 
 * Example:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaxSubArray {
    
    /**
     * Kadane's Algorithm - Optimal Solution
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
    
    /**
     * Brute Force Solution
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static int maxSubArrayBruteForce(int[] nums) {
        int maxSum = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        System.out.println("📊 Maximum Subarray Problem");
        System.out.println("===========================");
        
        // Test Case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Array: " + java.util.Arrays.toString(nums1));
        
        int result1 = maxSubArray(nums1);
        System.out.println("Maximum Sum: " + result1);
        
        // Test Case 2
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("\nArray: " + java.util.Arrays.toString(nums2));
        
        int result2 = maxSubArray(nums2);
        System.out.println("Maximum Sum: " + result2);
        
        // Test Case 3
        int[] nums3 = {-5, -3, -2, -7, -1};
        System.out.println("\nArray: " + java.util.Arrays.toString(nums3));
        
        int result3 = maxSubArray(nums3);
        System.out.println("Maximum Sum: " + result3);
        
        // Test Case 4
        int[] nums4 = {3, -2, 5, -1, 4, -6, 2, 3};
        System.out.println("\nArray: " + java.util.Arrays.toString(nums4));
        
        int result4 = maxSubArray(nums4);
        System.out.println("Maximum Sum: " + result4);
        
        System.out.println("\n📊 Complexity: O(n) time, O(1) space");
    }
} 