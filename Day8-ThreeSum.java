/*
Problem: 3Sum

Source: LeetCode

Difficulty: Medium

Topics: Array, Two Pointers, Sorting

Question:
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that

i != j
i != k
j != k

and

nums[i] + nums[j] + nums[k] == 0

The solution set must not contain duplicate triplets.

Example:

Input:
nums = [-1,0,1,2,-1,-4]

Output:
[[-1,-1,2],[-1,0,1]]

Explanation:
-1 + -1 + 2 = 0
-1 + 0 + 1 = 0
*/

import java.util.*;

public class Day08_ThreeSum {

    public static void main(String[] args) {

        int nums[] = {-1,0,1,2,-1,-4};

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}
