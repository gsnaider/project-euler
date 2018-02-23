package problems.impl.problem59;

import java.io.FileNotFoundException;
import java.util.List;

import common.util.FileUtil;
import common.util.StringUtil;
import problems.ProblemSolver;

public class Problem59Solver implements ProblemSolver {

	private static final String CIPHER_FILE_PATH = "problems/problem59/p059_cipher.txt";

	@Override
	public String solve() throws FileNotFoundException {
		
		List<List<String>> cipher = FileUtil.readCsvFile(CIPHER_FILE_PATH);
		List<String> words = StringUtil.commonEnglishWords();
		
		return String.valueOf(null);
	}


}
