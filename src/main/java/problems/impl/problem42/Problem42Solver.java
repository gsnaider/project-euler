package problems.impl.problem42;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import common.util.FileUtil;
import problems.ProblemSolver;

public class Problem42Solver implements ProblemSolver {

	private static final String filePath = "problems/problem42/p042_words.txt";

	@Override
	public String solve() throws FileNotFoundException {
		List<String> words = FileUtil.readLines(filePath);

		int maxWordLength = findMaxWordLength(words);
		int maxPossibleWordValue = value('Z') * maxWordLength;

		Set<Integer> triangleNumbers = calculateTriangleNumbers(maxPossibleWordValue);

		int triangleWords = 0;
		for (String word : words) {
			if (isTriangleWord(word, triangleNumbers)) {
				triangleWords++;
			}
		}

		return String.valueOf(triangleWords);
	}

	private static boolean isTriangleWord(String word, Set<Integer> triangleNumbers) {
		int wordValue = 0;
		for (int i = 0; i < word.length(); i++) {
			wordValue += value(word.charAt(i));
		}
		return triangleNumbers.contains(wordValue);
	}

	private static Set<Integer> calculateTriangleNumbers(int max) {
		Set<Integer> triangleNumbers = new HashSet<>();
		int triangle = 1;
		int n = 1;
		while (triangle <= max) {
			triangleNumbers.add(triangle);
			n++;
			triangle = (n * (n + 1)) / 2;
		}
		return triangleNumbers;
	}

	private static int findMaxWordLength(List<String> words) {
		int maxLength = 0;
		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
			}
		}
		return maxLength;
	}

	private static int value(char letter) {
		return letter - 'A' + 1;
	}

}
