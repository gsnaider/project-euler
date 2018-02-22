package common.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class StringUtil {

	private StringUtil() {
	}
	
	/**
	 * Returns a String which is the reverse of {@code s}.
	 * @param s The String to be reversed.
	 */
	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	/**
	 * Returns true if {@code s} is a palindrome.
	 * 
	 * <p>
	 * A palindrome is a sequence of characters which reads the same backward as
	 * forward. In this method, every character is used for verifying if the
	 * String is a palindrome, including spaces, punctuation, upper-case and
	 * lower-case.
	 */
	public static boolean isPalindrome(String s) {
		return s.equals(reverse(s));
	}
	
	/**
	 * Returns a Set containing all of the possible permutations formed with
	 * {@code chars} of size {@code length}.
	 */
	public static Set<String> permutations(List<Character> chars, int length) {
		if (chars == null || chars.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if (length < 1) {
			throw new IllegalArgumentException();
		}
		
		Set<String> permutations = new HashSet<>();
		if (length == 1) {
			for (Character c : chars) {
				permutations.add(c.toString());
			}
		} else {
			Set<String> shorterPermutations = permutations(chars, length - 1);
			for (String shorterPermutation : shorterPermutations) {
				for (char c : chars) {
					permutations.add(shorterPermutation + c);
				}
			}
		}
		
		return permutations;
	}

	/**
	 * Returns a Set containing all of the possible permutations formed with
	 * {@code s}. Note that the Set will also contain {@code s}.
	 */
	public static Set<String> permutations(String s) {
		return permutations("", s);
	}
	
	private static Set<String> permutations(String prefix, String s) {
		Set<String> permutations = new HashSet<>();
		if (s.isEmpty()) {
			permutations.add(prefix);
			return permutations;
		}
		for (int i = 0; i < s.length(); i++) {
			char prefixChar = s.charAt(i);
			String prefixWithChar = prefix + prefixChar;
			String stringWithoutChar = s.substring(0, i) + s.substring(i + 1);
			permutations.addAll(permutations(prefixWithChar, stringWithoutChar));
		}
		return permutations;
	}

}
