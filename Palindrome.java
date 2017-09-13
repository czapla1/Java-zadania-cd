package leetcode;
//Determine whether an integer is a palindrome. Do this without extra space.
public class Palindrome {

	public boolean isPalindrome(int x) {
		String xToString;
		String xReverse = "";
		boolean result = false;
		if (x == 0) {

			result = true;
			return result;
		}
		if (x < 0) {
			result = false;
			return result;
		} else if (x > 0) {
			xToString = x + "";

			for (int i = xToString.length() - 1; i >= 0; i--) {
				xReverse += xToString.substring(i, i + 1);
			}
			//System.out.println(xReverse); 
			
			if (xReverse.equals(xToString)) {
				result = true;
				return result;
			} else {
				//System.out.println("raz");
				result = false;
				return result;
			}
		}
		else {
			//System.out.println("cos");
			return result;
		}
		}
	

	public static void main(String[] args) {

		Palindrome obj = new Palindrome();

		System.out.println(obj.isPalindrome(1001));

	}
}
