package problems.problem22;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import util.FileUtil;

public class Problem22 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> names = FileUtil.readLines("problems/problem22/p022_names.txt");
		Collections.sort(names);
		long scoresSum = 0;
		int pos = 1;
		for (String name : names) {
			scoresSum += calculateScore(name, pos);
			pos++;
		}
		System.out.println(scoresSum);
	}

	private static long calculateScore(String name, int pos) {
		long score = 0;
		for (int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);
			score += letter - 'A' + 1;
		}
		return score * pos;
	}

}
