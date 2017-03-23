package problems.problem12;

public class Problem12 {

//	private static final int MIN_FACTORS = 5;
	private static final int MIN_FACTORS = 500;
	
	
	
	public static void main(String[] args) {

		long triangle = 0;
		long i = 1;
		
		while (countFactors(triangle) <= MIN_FACTORS) {
			triangle += i++;
		}
		
		System.out.println(triangle);
		
	}

	public static int countFactors(long n) {
		int factors = 0;
		long max = Math.round(Math.sqrt(n));
		for (int i = 1; i <= max; i++) {
			if (n % i == 0) {
				factors++;
			}
		}
		return factors * 2;
	}
	
}
