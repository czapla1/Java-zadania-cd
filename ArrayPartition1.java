package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) 
which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].*/


public class ArrayPartition1 {

	public int arrayPairSum(int[] nums) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}

		Collections.sort(list);
		System.out.println("Po sortowaniu");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i));
		}
		System.out.println("length " + list.size());

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {

			if (i % 2 == 0) {
				System.out.println(i + " " + list.get(i));
				sum += list.get(i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		ArrayPartition1 arpar = new ArrayPartition1();
		int[] nums = { 1, 4, 3, 2 };
		System.out.println(arpar.arrayPairSum(nums));
	}
}
