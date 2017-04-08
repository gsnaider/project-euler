package common.util;

public final class StringUtil {

	private StringUtil() {
	}

	/**
	 * Returns true if {@code s} is a palindrome.
	 * 
	 * <p>
	 * A palindrome is a sequence of characters which reads the same backward as
	 * forward. In this method, every character is used for verifying if the
	 * String is a palindrome, including spaces, punctuation, upper-case and
	 * lower-case.
	 * 
	 * @return
	 */
	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}

}
