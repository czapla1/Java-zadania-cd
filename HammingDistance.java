package leetcode;
/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note:
0 ≤ x, y < 231.
Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ?   ?
The above arrows point to positions where the corresponding bits are different.*/

public class HammingDistance {

	public int hammingDistance(int x, int y) {
		int licznik = 0;

		int binary1[] = new int[40];
		int index1 = binary1.length - 1;
		while (x > 0) {
			binary1[index1] = x % 2;
			x = x / 2;
			index1--;
		}
		for (int i = 0; i < binary1.length; i++) {
			System.out.print(binary1[i]);
		}
		System.out.println();
		int binary2[] = new int[40];
		int index2 = binary2.length - 1;
		while (y > 0) {
			binary2[index2] = y % 2;
			y = y / 2;
			index2--;
		}
		for (int i = 0; i < binary2.length; i++) {
			System.out.print(binary2[i]);
		}
		System.out.println();

		for (int i = 0; i < binary1.length; i++) {
			if (binary1[i] != binary2[i]) {
				licznik++;
			}
		}
		return licznik;
	}

	public static void main(String[] args) {
		HammingDistance hd = new HammingDistance();
		System.out.println(hd.hammingDistance(4, 10));
		
	}

}
