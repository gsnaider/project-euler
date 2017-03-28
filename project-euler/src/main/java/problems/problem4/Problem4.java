package problems.problem4;

final class Problem4 {

	public static void main(String[] args) {
		int largestPalindrome = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) { 
				int mult = i*j;
				if (mult > largestPalindrome && isPalindrome(mult)) {
					largestPalindrome = mult;
				}
			}
		}
		
		System.out.println(largestPalindrome);
	}

	private static boolean isPalindrome(int n) {
		String num = String.valueOf(n);
		return (num.equals(new StringBuffer(num).reverse().toString()));
	}
}
