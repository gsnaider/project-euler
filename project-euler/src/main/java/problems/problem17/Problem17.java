package problems.problem17;
import static problems.problem17.Constants.*;

public class Problem17 {

//	private static final int MAX = 5;
	private static final int MAX = 1000;
	
	public static void main(String[] args) {
		
		long sum = 0;
		for (int i = 1; i <= MAX; i++) {
			sum += countLetters(i);
		}
		System.out.println(sum);
	}

	private static long countLetters(int i) {
		String word = "";
		if (i == 1000) {
			word = numberWords.get(1) + numberWords.get(i);
			System.out.println(word);
			return word.length();
		}
		if (i >= 100) {
			word += numberWords.get(i / 100);
			word += numberWords.get(100);
			i %= 100;
			if (i > 0) {
				word += AND;
			} else {
				System.out.println(word);
				return word.length();
			}
		}
		if (i < 20) {
			word += numberWords.get(i);
		} else {
			int lastDigit = i % 10;
			word += numberWords.get(i - lastDigit);
			if (lastDigit > 0) {
				word += numberWords.get(lastDigit);
			}
		}
		System.out.println(word);
		return word.length();
	}
	
}
