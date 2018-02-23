package problems.impl.problem58;

import java.util.Set;

import com.google.common.collect.Sets;

import common.util.PrimeUtil;
import problems.ProblemSolver;

public class Problem58Solver implements ProblemSolver {

	private static final int MIN_RATIO = 10;

	@Override
	public String solve() {
		int layer = 0;
		int lastNumber = 1;
		int nextOddSquare = 3;
		Set<Integer> diagonalElements = Sets.newHashSet(1);
		int diagonalPrimeCount = 0;
		do {
			layer++;
			int layerNumber = 0;
			for (int currentNumber = lastNumber + 1; currentNumber <= nextOddSquare * nextOddSquare; currentNumber++) {
				layerNumber++;
				if (isInDiagonal(layer, layerNumber)) {
					diagonalElements.add(currentNumber);
					if (PrimeUtil.isPrime(currentNumber)) {
						diagonalPrimeCount++;
					}
				}

				lastNumber = currentNumber;
			}
			nextOddSquare = nextOddSquare + 2;
		} while (ratio(diagonalElements, diagonalPrimeCount) >= MIN_RATIO);

		return String.valueOf(side(layer));
	}

	private boolean isInDiagonal(int layer, int layerNumber) {
		return layer == 0 ? true : layerNumber % (side(layer) - 1) == 0;
	}

	private int side(int layer) {
		return layer * 2 + 1;
	}

	private int ratio(Set<Integer> diagonalElements, int diagonalPrimeCount) {
		return diagonalPrimeCount * 100 / diagonalElements.size();
	}

}
