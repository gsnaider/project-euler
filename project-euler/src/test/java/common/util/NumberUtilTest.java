package common.util;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class NumberUtilTest {
	
	@Test
	public void testGcdReturnsOneWhenOneArgumentIsOne() {
		for (int i = 1; i <= 10; i++) {
			assertThat(NumberUtil.gcd(1, i)).isEqualTo(1);
		}
	}
	
	@Test
	public void testGcdReturnsOneWhenNoCommonDivisor() {
		assertThat(NumberUtil.gcd(3, 5)).isEqualTo(1);
		assertThat(NumberUtil.gcd(2, 9)).isEqualTo(1);
		assertThat(NumberUtil.gcd(15, 4)).isEqualTo(1);
	}
	
	@Test
	public void testGcdReturnsACommonDivisor() {
		assertThat(NumberUtil.gcd(2, 4)).isEqualTo(2);
		assertThat(NumberUtil.gcd(9, 3)).isEqualTo(3);
		assertThat(NumberUtil.gcd(15, 5)).isEqualTo(5);
	}
	
	@Test
	public void testGcdReturnsGreatestCommonDivisor() {
		assertThat(NumberUtil.gcd(4, 8)).isEqualTo(4);
		assertThat(NumberUtil.gcd(27, 18)).isEqualTo(9);
		assertThat(NumberUtil.gcd(18, 24)).isEqualTo(6);
	}
	
	@Test
	public void testFactorial() {
		assertThat(NumberUtil.factorial(0)).isEqualTo(1L);
		assertThat(NumberUtil.factorial(1)).isEqualTo(1L);
		assertThat(NumberUtil.factorial(2)).isEqualTo(2L);
		assertThat(NumberUtil.factorial(3)).isEqualTo(6L);
		assertThat(NumberUtil.factorial(4)).isEqualTo(24L);
		assertThat(NumberUtil.factorial(5)).isEqualTo(120L);
		assertThat(NumberUtil.factorial(6)).isEqualTo(720L);
		assertThat(NumberUtil.factorial(7)).isEqualTo(5040L);
		assertThat(NumberUtil.factorial(8)).isEqualTo(40320L);
		assertThat(NumberUtil.factorial(9)).isEqualTo(362880L);
		assertThat(NumberUtil.factorial(10)).isEqualTo(3628800L);
		assertThat(NumberUtil.factorial(15)).isEqualTo(1307674368000L);
		assertThat(NumberUtil.factorial(20)).isEqualTo(2432902008176640000L);
	}
	
}
