package problems.impl.problem19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import problems.ProblemSolver;

public final class Problem19Solver implements ProblemSolver {

	private static final int FIRST_YEAR = 1901;
	private static final int LAST_YEAR = 2000;

	@Override
	public String solve() {

		long sundays = 0;
		for (int year = FIRST_YEAR; year <= LAST_YEAR; year++) {
			for (Month month : Month.values()) {
				LocalDate date = LocalDate.of(year, month, 1);
				if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
					sundays++;
				}
			}
		}
		return String.valueOf(sundays);

	}

}
