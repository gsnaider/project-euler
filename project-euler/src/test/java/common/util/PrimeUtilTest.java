package common.util;

import static com.google.common.truth.Truth.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class PrimeUtilTest {

	private static final ImmutableList<Long> primes =
			ImmutableList.of(
					2L,
					3L,
					5L,
					7L,
					11L,
					13L,
					17L,
					19L,
					23L,
					29L);
	
	private static final ImmutableList<Long> nonPrimes =
			ImmutableList.of(
					0L,
					1L,
					4L,
					6L,
					8L,
					9L,
					10L,
					12L,
					14L,
					15L,
					16L);
	
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
	
	
	@Test
	public void testPrimeFactors() {
		
		Map<Long, ImmutableMap<Long, Integer>> primeFactors = new HashMap<>();
		primeFactors.put(4L, ImmutableMap.of(2L, 2));
		primeFactors.put(6L, ImmutableMap.of(2L, 1, 3L, 1));
		primeFactors.put(9L, ImmutableMap.of(3L, 2));
		primeFactors.put(12L, ImmutableMap.of(2L, 2, 3L, 1));
		primeFactors.put(14L, ImmutableMap.of(2L, 1, 7L, 1));
		primeFactors.put(15L, ImmutableMap.of(3L, 1, 5L, 1));
		primeFactors.put(18L, ImmutableMap.of(2L, 1, 3L, 2));
		
		for (Entry<Long, ImmutableMap<Long, Integer>> factors : primeFactors.entrySet()) {
			assertThat(PrimeUtil.primeFactors(factors.getKey(), primes)).isEqualTo(factors.getValue());
		}
	}
	
	@Test
	public void testPrimeFactorsForPrimes() {
		for (long prime : primes) {
			assertThat(PrimeUtil.primeFactors(prime, primes)).containsExactly(prime, 1);
		}
	}
}
