package problems.impl.problem22;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import common.util.FileUtil;
import problems.ProblemSolver;

public final class Problem22Solver implements ProblemSolver {

	@Override
	public String solve() throws FileNotFoundException {
		List<String> names = FileUtil.readLines("problems/problem22/p022_names.txt");
		Collections.sort(names);
		long scoresSum = 0;
		int pos = 1;
		for (String name : names) {
			scoresSum += calculateScore(name, pos);
			pos++;
		}
		return String.valueOf(scoresSum);
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
