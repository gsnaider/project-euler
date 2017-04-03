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
	
}
