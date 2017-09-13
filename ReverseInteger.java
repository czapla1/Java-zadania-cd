package leetcode;

/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
*/

public class ReverseInteger {

	public int reverse(int x) {
		String revX = "";
		if (x == 0) {
			return 0;
		} else if (x > 0 && x % 10 == 0) {

			while (x % 10 == 0) {
				x /= 10;

			}
			String licz = x + "";
			for (int i = licz.length() - 1; i >= 0; i--) {
				revX += licz.substring(i, i + 1);
			}
			return Integer.parseInt(revX);
		} else if (x < 0 && x % 10 == 0) {

			while (x % 10 == 0) {
				x /= 10;

			}
			String licz = x + "";
			for (int i = licz.length() - 1; i > 0; i--) {
				revX += licz.substring(i, i + 1);
			}
			x = Integer.parseInt(revX) * (-1);
		} else if (x > 0) {

			String licz = x + "";
			for (int i = licz.length() - 1; i >= 0; i--) {
				revX += licz.substring(i, i + 1);
				if (Long.parseLong(revX) > Integer.MAX_VALUE) {
					return 0;
				} else
					x = Integer.parseInt(revX);
			}

		} else if (x < 0) {

			String licz = x + "";
			for (int i = licz.length() - 1; i > 0; i--) {
				revX += licz.substring(i, i + 1);
				if (Long.parseLong(revX) * (-1) < Integer.MIN_VALUE) {
					return 0;
				} else
					x = Integer.parseInt(revX) * (-1);
			}
			x = Integer.parseInt(revX) * (-1);
		}
		return x;
	}

	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(-1067));
	}

}
