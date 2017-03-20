package problems.problem9;

public class Problem9 {

	private static final int SUM = 1000;
	
	public static void main(String[] args) {
		
		for (int a = 1; a < SUM - 3; a++) {
			for (int b = a + 1; b < SUM - 2; b++) {
				for (int c = b + 1; c < SUM - 1; c++) {
					if (isPythagoreanTriplet(a,b,c) && (a + b + c == SUM)) {
						System.out.println(a*b*c);
						break;
					}
				}
			}
		}

	}

	private static boolean isPythagoreanTriplet(int a, int b, int c) {
		return (a*a + b*b == c*c);
	}

}
