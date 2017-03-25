package problems.problem24;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem24 {

	private static final int MILLION = 1000000;

	public static void main(String[] args) {
		String millionthPerm = "";

		int startingPos = 0;

		List<Integer> buckets = new LinkedList<>();
		Collections.addAll(buckets, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * We check the first digit by conceptually dividing all possible
		 * permutations into buckets. Each bucket contains the permutations that
		 * start with each digit. We iterate over the starting position of each
		 * bucket, to see at which point we pass the millionth position. At that
		 * point, we identify the bucket where the millionth permutation resides
		 * (which means we already know the first digit). We remove that digit
		 * from availableDigits, and we repeat the process inside this bucket.
		 * We do this ten times until we identify all the digits.
		 * 
		 */
		for (int i = 10; i > 0; i--) {

			// calculate permutations = i!
			int permutations = 1;
			for (int j = 1; j <= i; j++) {
				permutations *= j;
			}

			int bucketSize = permutations / i;
			int k = 0;
			while (startingPos + bucketSize * k < MILLION) {
				k++;
			}
			int bucket = k - 1;
			millionthPerm += buckets.remove(bucket); 
			startingPos = startingPos + bucketSize * bucket;
		}

		System.out.println(millionthPerm);
	}

}
