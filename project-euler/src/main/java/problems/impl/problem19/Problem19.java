package problems.impl.problem19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

final class Problem19 {

	private static final int FIRST_YEAR = 1901;
	private static final int LAST_YEAR = 2000;

	public static void main(String[] args) {

		long sundays = 0;
		for (int year = FIRST_YEAR; year <= LAST_YEAR; year++) {
			for (Month month : Month.values()) {
				LocalDate date = LocalDate.of(year, month, 1);
				if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
					sundays++;
				}
			}
		}
		System.out.println(sundays);

	}

}
