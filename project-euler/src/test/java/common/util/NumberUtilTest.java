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
	
	@Test
	public void testIsPandigital_falseForNonPandigitals() {
		assertThat(NumberUtil.isPandigital(0)).isFalse();
		assertThat(NumberUtil.isPandigital(1)).isFalse();
		assertThat(NumberUtil.isPandigital(2)).isFalse();
		assertThat(NumberUtil.isPandigital(123)).isFalse();
		assertThat(NumberUtil.isPandigital(1234567890)).isFalse();
	}
	
	@Test
	public void testIsPandigital_trueForPandigitals() {
		assertThat(NumberUtil.isPandigital(123456789)).isTrue();
		assertThat(NumberUtil.isPandigital(987654321)).isTrue();
		assertThat(NumberUtil.isPandigital(381654729)).isTrue();
	}

	@Test
	public void testIsNPandigital_falseForNonNPandigitals() {
		assertThat(NumberUtil.isNPandigital(0, 1)).isFalse();
		assertThat(NumberUtil.isNPandigital(0, 9)).isFalse();
		assertThat(NumberUtil.isNPandigital(1, 2)).isFalse();
		assertThat(NumberUtil.isNPandigital(2, 1)).isFalse();
		assertThat(NumberUtil.isNPandigital(123, 1)).isFalse();
		assertThat(NumberUtil.isNPandigital(123, 2)).isFalse();
		assertThat(NumberUtil.isNPandigital(123, 4)).isFalse();
		assertThat(NumberUtil.isNPandigital(1023, 3)).isFalse();
	}
	
	@Test
	public void testIsNPandigital_trueForNPandigitals() {
		assertThat(NumberUtil.isNPandigital(1, 1)).isTrue();
		assertThat(NumberUtil.isNPandigital(21, 2)).isTrue();
		assertThat(NumberUtil.isNPandigital(123, 3)).isTrue();
		assertThat(NumberUtil.isNPandigital(231, 3)).isTrue();
		assertThat(NumberUtil.isNPandigital(123456789, 9)).isTrue();
	}
	
}
