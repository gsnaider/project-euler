package problems.impl.problem59;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

import common.util.FileUtil;
import common.util.StringUtil;
import exception.NoSolutionFoundException;
import problems.ProblemSolver;

public class Problem59Solver implements ProblemSolver {

	private static final String CIPHERED_FILE_PATH = "problems/problem59/p059_cipher.txt";
	private static final int MIN_ENGLISH_WORDS_IN_TEXT = 6;
	
	@Override
	public String solve() throws Exception {

		List<Integer> cipheredTextInASCII = FileUtil.readCsvFile(CIPHERED_FILE_PATH).get(0).stream()
				.map(ascii -> Integer.valueOf(ascii)).collect(Collectors.toList());
		List<String> commonWords = StringUtil.commonEnglishWords();
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			for (char c2 = 'a'; c2 <= 'z'; c2++) {
				for (char c3 = 'a'; c3 <= 'z'; c3++) {
					StringBuilder stringBuilder = new StringBuilder(cipheredTextInASCII.size());
					int i = 0;
					for (int charAscii : cipheredTextInASCII) {
						
						switch (i % 3) {
						case 0:
							stringBuilder.append((char) (c1 ^ charAscii));
							break;
						case 1:
							stringBuilder.append((char) (c2 ^ charAscii));
							break;
						case 2:
							stringBuilder.append((char) (c3 ^ charAscii));
							break;
						default:
							throw new AssertionError();
						}
						
						i++;
					}
					String decipheredText = stringBuilder.toString();
					
					if (isEnglishMessage(decipheredText, commonWords)) {
						return String.valueOf(sumAsciiValues(decipheredText));
					}
				}
			}
		}
		throw new NoSolutionFoundException();
	}

	private int sumAsciiValues(String decipheredText) {
		int sum = 0;
		for (char c : decipheredText.toCharArray()) {
			sum += c;
		}
		return sum;
	}

	private boolean isEnglishMessage(String decipheredText, List<String> commonWords) {
		for (String word : commonWords.subList(0, MIN_ENGLISH_WORDS_IN_TEXT)) {
			if (!decipheredText.contains(word)) {
				return false;
			}
		}
		return true;
	}

}
