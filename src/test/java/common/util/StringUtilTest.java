package common.util;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class StringUtilTest {

	@Test
	public void testReverse() {
		assertThat(StringUtil.reverse("")).isEqualTo("");
		assertThat(StringUtil.reverse("A")).isEqualTo("A");
		assertThat(StringUtil.reverse("AA")).isEqualTo("AA");
		assertThat(StringUtil.reverse("ABC")).isEqualTo("CBA");
		assertThat(StringUtil.reverse("ABCD")).isEqualTo("DCBA");
	}
	
	@Test
	public void testIsPalindromeReturnsTrueForEmptyString() {
		assertThat(StringUtil.isPalindrome("")).isTrue();
	}

	@Test
	public void testIsPalindromeReturnsTrueForStringsOfLengthOne() {
		assertThat(StringUtil.isPalindrome("A")).isTrue();
		assertThat(StringUtil.isPalindrome("B")).isTrue();
		assertThat(StringUtil.isPalindrome("C")).isTrue();
		assertThat(StringUtil.isPalindrome("x")).isTrue();
		assertThat(StringUtil.isPalindrome("y")).isTrue();
		assertThat(StringUtil.isPalindrome("z")).isTrue();
		assertThat(StringUtil.isPalindrome("1")).isTrue();
		assertThat(StringUtil.isPalindrome("2")).isTrue();
		assertThat(StringUtil.isPalindrome("3")).isTrue();
		assertThat(StringUtil.isPalindrome(".")).isTrue();
		assertThat(StringUtil.isPalindrome(" ")).isTrue();
	}

	@Test
	public void testIsPalindromeReturnsTrueForPalindromeWords() {
		assertThat(StringUtil.isPalindrome("madam")).isTrue();
		assertThat(StringUtil.isPalindrome("racecar")).isTrue();
		assertThat(StringUtil.isPalindrome("bob")).isTrue();
	}

	@Test
	public void testIsPalindromeReturnsFalseForNonPalindromeWords() {
		assertThat(StringUtil.isPalindrome("car")).isFalse();
		assertThat(StringUtil.isPalindrome("house")).isFalse();
		assertThat(StringUtil.isPalindrome("table")).isFalse();
	}

	@Test
	public void testIsPalindromeUpperCaseVerified() {
		assertThat(StringUtil.isPalindrome("Aa")).isFalse();
	}

	@Test
	public void testIsPalindromeSpacesVerified() {
		assertThat(StringUtil.isPalindrome("my gym")).isFalse();
	}

	@Test
	public void testIsPalindromePunctuationVerified() {
		assertThat(StringUtil.isPalindrome("wow!")).isFalse();
	}

	@Test
	public void testPermutations() {
		assertThat(StringUtil.permutations("")).containsExactly("");
		assertThat(StringUtil.permutations("A")).containsExactly("A");
		assertThat(StringUtil.permutations("AB")).containsExactly("AB", "BA");
		assertThat(StringUtil.permutations("AAB")).containsExactly("AAB", "ABA", "BAA");
		assertThat(StringUtil.permutations("ABC")).containsExactly("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
	}
	
	@Test
	public void testPermutationsWithCharList() {
		ImmutableList<Character> chars = ImmutableList.of('A', 'B', 'C');
		assertThat(StringUtil.permutations(chars, 1)).containsExactly("A", "B", "C");
		assertThat(StringUtil.permutations(chars, 2)).containsExactly("AA", "AB", "AC", "BA", "BB", "BC", "CA", "CB", "CC");
	}
}
