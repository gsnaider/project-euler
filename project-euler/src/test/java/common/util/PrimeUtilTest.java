package common.util;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class PrimeUtilTest {

	private static final ImmutableList<Long> primes =
			ImmutableList.of(
					Long.valueOf(2),
					Long.valueOf(3),
					Long.valueOf(5),
					Long.valueOf(7),
					Long.valueOf(11),
					Long.valueOf(13),
					Long.valueOf(17),
					Long.valueOf(19),
					Long.valueOf(23),
					Long.valueOf(29));
	
	private static final ImmutableList<Long> nonPrimes =
			ImmutableList.of(
					Long.valueOf(0),
					Long.valueOf(1),
					Long.valueOf(4),
					Long.valueOf(6),
					Long.valueOf(8),
					Long.valueOf(9),
					Long.valueOf(10),
					Long.valueOf(12),
					Long.valueOf(14),
					Long.valueOf(15),
					Long.valueOf(16));
	
	
	@Test
	public void testIsPrime_trueForPrimes() {
		for (Long prime : primes) {
			assertThat(PrimeUtil.isPrime(prime)).isTrue();
		}
	}
	
	@Test
	public void testIsPrime_falseForNonPrimes() {
		for (Long prime : nonPrimes) {
			assertThat(PrimeUtil.isPrime(prime)).isFalse();
		}
	}
	
	@Test
	public void testFindPrime() {
		int idx = 1;
		for (Long prime : primes) {
			assertThat(PrimeUtil.findPrime(idx)).isEqualTo(prime);
			idx++;
		}
	}
}
