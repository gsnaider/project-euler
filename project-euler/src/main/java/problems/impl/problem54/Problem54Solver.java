package problems.impl.problem54;

import java.io.FileNotFoundException;
import java.util.List;

import common.util.FileUtil;
import problems.ProblemSolver;
import problems.impl.problem54.model.Game;
import problems.impl.problem54.util.GameReader;

public class Problem54Solver implements ProblemSolver {

	private static final String FILE_PATH = "problems/problem54/p054_poker.txt";
	
	@Override
	public String solve() throws FileNotFoundException {

		List<String> games = FileUtil.readLines(FILE_PATH);
		
		int playerOneWins = 0;
		for (String gameCode : games) {
			Game game = GameReader.read(gameCode);
			if (game.winner() == 1) {
				playerOneWins++;
			}
		}
		
		return String.valueOf(playerOneWins);
	}

}
