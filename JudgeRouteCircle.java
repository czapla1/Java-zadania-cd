package leetcode;

/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false*/

public class JudgeRouteCircle {

	public boolean judgeCircle(String moves) {
		int lU = 0;
		int lD = 0;
		int lR = 0;
		int lL = 0;

		if (moves.length() % 2 == 0) {
			for (int i = 0; i < moves.length(); i++) {
				if (moves.substring(i, i + 1).equals("U")) {
					lU++;
				} else if (moves.substring(i, i + 1).equals("D")) {
					lD++;
				} else if (moves.substring(i, i + 1).equals("R")) {
					lR++;
				} else if (moves.substring(i, i + 1).equals("L")) {
					lL++;
				}
			}
		}
		if (lU == lD && lR == lL) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		JudgeRouteCircle jrc = new JudgeRouteCircle();
		System.out.println(jrc.judgeCircle("RLUURDDDLU"));

	}

}
