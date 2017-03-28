package problems.problem1;

final class Problem1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if(isMultiple(i)) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

	private static boolean isMultiple(int i) {
		
		return(i % 3 == 0 || i % 5 == 0);
		
	}
	
}
