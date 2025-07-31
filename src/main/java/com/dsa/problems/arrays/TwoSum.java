package com.dsa.problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum Problem
 * 
 * Problem: Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSum {
    
    /**
     * Optimal Solution using HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found");
    }
    
    /**
     * Brute Force Solution
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        throw new IllegalArgumentException("No solution found");
    }
    
    public static void main(String[] args) {
        System.out.println("🔍 Two Sum Problem");
        System.out.println("==================");
        
        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Array: " + java.util.Arrays.toString(nums1));
        System.out.println("Target: " + target1);
        
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Values: [" + nums1[result1[0]] + ", " + nums1[result1[1]] + "]");
        
        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("\nArray: " + java.util.Arrays.toString(nums2));
        System.out.println("Target: " + target2);
        
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]");
        
        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("\nArray: " + java.util.Arrays.toString(nums3));
        System.out.println("Target: " + target3);
        
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]");
        
        System.out.println("\n📊 Complexity: O(n) time, O(n) space");
    }
}
