package problems.problem6;

final class Problem6 {

//	private static final int MAX = 10;
	private static final int MAX = 100;
	
	public static void main(String[] args) {
	
		int sum = 0;
		int sumOfSquares = 0;
		
		for (int i = 1; i <= MAX; i++) {
			sum += i;
			sumOfSquares += i*i;
		}
		
		System.out.println(sum*sum - sumOfSquares);
		
	}

}
