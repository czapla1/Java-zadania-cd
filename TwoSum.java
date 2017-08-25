package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	            
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	
	public static void main(String [] args){
		TwoSum sum1= new TwoSum();
		int[] tab=new int [2];	
		for(int i=0; i<new int[]{2,7,11,5}.length; i++){
			tab=sum1.twoSum(new int[]{2,7,11,5},9);
		}
			for(int a:tab){
				System.out.print(a+" ");
			}	
				
	}
}
