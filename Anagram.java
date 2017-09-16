package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Check if provided words are anagrams*/

public class Anagram {
	public static void main(String[] args) {
		String firstWord = "anagram";
		String secondWord = "margana";

		System.out.println(isAnagram(firstWord, secondWord));
	}

	public static TreeMap <Character, Integer> collectLetters(String word) {
		Map<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<word.length(); i++) {
			Character currentLetter = word.toLowerCase().charAt(i);
			if(map!= null && map.containsKey(currentLetter)) {
				map.put(currentLetter, map.get(currentLetter)+1);
			} else {
				map.put(currentLetter, 1);
			}
		}
		return (TreeMap<Character, Integer>) map;
	}
	
	public static boolean isAnagram(String firstWord, String secondWord) {
		return collectLetters(firstWord).equals(collectLetters(secondWord));
	}

}
