package problems.impl.problem17;
import static problems.impl.problem17.Constants.*;

import problems.ProblemSolver;

public final class Problem17Solver implements ProblemSolver {

//	private static final int MAX = 5;
	private static final int MAX = 1000;
	
	@Override
	public String solve() {
		
		long sum = 0;
		for (int i = 1; i <= MAX; i++) {
			sum += countLetters(i);
		}
		return String.valueOf(sum);
	}

	private static long countLetters(int i) {
		String word = "";
		if (i == 1000) {
			word = numberWords.get(1) + numberWords.get(i);
			return word.length();
		}
		if (i >= 100) {
			word += numberWords.get(i / 100);
			word += numberWords.get(100);
			i %= 100;
			if (i > 0) {
				word += AND;
			} else {
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
		return word.length();
	}
	
}
