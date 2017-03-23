package problems.problem16;

import java.math.BigInteger;

public class Problem16 {

//	private static final int EXP = 15;
	private static final int EXP = 1000;
	
	public static void main(String[] args) {
		
		BigInteger two = new BigInteger("2");
		String result = two.pow(EXP).toString();
		
		long sum = 0;
		for (int i = 0; i < result.length(); i++) {
			sum += result.charAt(i);
		}
		System.out.println(sum);
	}

}
