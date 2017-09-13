package leetcode;

/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0 */

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		int index = 0;
		if (nums.length == 0) {
			index = 0;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target) {
					index = i;
					break;
				} else {
					if (nums[i] > target) {
						if (i - 1 < 0) {
							index = 0;
							break;
						} else {
							index = i;
							break;
						}
					} else {
						index = nums.length - 1 + 1;
					}
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {

		SearchInsertPosition obj = new SearchInsertPosition();
		System.out.println(obj.searchInsert(new int[] { 1, 3, 5, 6 }, 0));

		/*
		 * [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7 → 4 [1,3,5,6], 0 → 0
		 */

	}

}
