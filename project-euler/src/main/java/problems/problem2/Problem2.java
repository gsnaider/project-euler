package problems.problem2;

public class Problem2 {

	private static final int MAX = 4000000;
	
	public static void main(String[] args) {
		
		int prev = 1;
		int fib = 2;
		
		int sum = 0;
		
		do {
			if (fib % 2 == 0){
				sum += fib;
			}
			int next = prev + fib;
			prev = fib;
			fib = next;
		} while (fib <= MAX);
		
		System.out.println(sum);
	}
	
}
