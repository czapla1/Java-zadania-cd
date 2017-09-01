package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Given a positive integer, output its complement number. 
The complement strategy is to flip the bits of its binary representation.
Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5/Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. 
So you need to output 2.
Example 2:
Input: 1/Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/

public class FindComplement {

	public int findComplement(int num) {

		List<Integer> list = new ArrayList<>();
		int sum = 0;
		while (num != 0) {
			list.add(num % 2);
			num /= 2;
		}

		for (int i = 0; i < list.size(); i++) {
			int var = list.get(i);
			if (var == 1) {
				list.set(i, 0);
			} else
				list.set(i, 1);
		}


		for (int i = 0; i < list.size() - 1; i++) {
			sum += list.get(i) * Math.pow(2, i);
		}

		return sum;
	}

	public static void main(String[] args) {
		FindComplement object = new FindComplement();

		System.out.println(object.findComplement(5));
	}
}
