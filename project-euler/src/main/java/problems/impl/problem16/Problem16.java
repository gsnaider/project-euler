package problems.impl.problem16;

import java.math.BigInteger;

final class Problem16 {

//	private static final int EXP = 15;
	private static final int EXP = 1000;
	
	public static void main(String[] args) {
		
		BigInteger two = new BigInteger("2");
		String result = two.pow(EXP).toString();
		
		long sum = 0;
		for (int i = 0; i < result.length(); i++) {
			int digit = Character.digit(result.charAt(i), 10);
			sum += digit;
		}
		System.out.println(sum);
	}

}
