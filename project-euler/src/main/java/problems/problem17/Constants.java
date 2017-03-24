package problems.problem17;

import java.util.HashMap;
import java.util.Map;

public final class Constants {

	static final String ONE = "one";
	static final String TWO = "two";
	static final String THREE = "three";
	static final String FOUR = "four";
	static final String FIVE = "five";
	static final String SIX = "six";
	static final String SEVEN = "seven";
	static final String EIGHT = "eight";
	static final String NINE = "nine";
	static final String TEN = "ten";
	static final String ELEVEN = "eleven";
	static final String TWELVE = "twelve";
	static final String THIRTEEN = "thirteen";
	static final String FOURTEEN = "fourteen";
	static final String FIFTEEN = "fifteen";
	static final String SIXTEEN = "sixteen";
	static final String SEVENTEEN = "seventeen";
	static final String EIGHTEEN = "eighteen";
	static final String NINETEEN = "nineteen";
	static final String TWENTY = "twenty";
	static final String THIRTY = "thirty";
	static final String FORTY = "forty";
	static final String FIFTY = "fifty";
	static final String SIXTY = "sixty";
	static final String SEVENTY = "seventy";
	static final String EIGHTY = "eighty";
	static final String NINETY = "ninety";
	static final String HUNDRED = "hundred";
	static final String THOUSAND = "thousand";
	static final String AND = "and";

	static final Map<Integer, String> numberWords = new HashMap<>();
	static {
		numberWords.put(Integer.valueOf(1), ONE);
		numberWords.put(Integer.valueOf(2), TWO);
		numberWords.put(Integer.valueOf(3), THREE);
		numberWords.put(Integer.valueOf(4), FOUR);
		numberWords.put(Integer.valueOf(5), FIVE);
		numberWords.put(Integer.valueOf(6), SIX);
		numberWords.put(Integer.valueOf(7), SEVEN);
		numberWords.put(Integer.valueOf(8), EIGHT);
		numberWords.put(Integer.valueOf(9), NINE);
		numberWords.put(Integer.valueOf(10), TEN);
		numberWords.put(Integer.valueOf(11), ELEVEN);
		numberWords.put(Integer.valueOf(12), TWELVE);
		numberWords.put(Integer.valueOf(13), THIRTEEN);
		numberWords.put(Integer.valueOf(14), FOURTEEN);
		numberWords.put(Integer.valueOf(15), FIFTEEN);
		numberWords.put(Integer.valueOf(16), SIXTEEN);
		numberWords.put(Integer.valueOf(17), SEVENTEEN);
		numberWords.put(Integer.valueOf(18), EIGHTEEN);
		numberWords.put(Integer.valueOf(19), NINETEEN);
		numberWords.put(Integer.valueOf(20), TWENTY);
		numberWords.put(Integer.valueOf(30), THIRTY);
		numberWords.put(Integer.valueOf(40), FORTY);
		numberWords.put(Integer.valueOf(50), FIFTY);
		numberWords.put(Integer.valueOf(60), SIXTY);
		numberWords.put(Integer.valueOf(70), SEVENTY);
		numberWords.put(Integer.valueOf(80), EIGHTY);
		numberWords.put(Integer.valueOf(90), NINETY);
		numberWords.put(Integer.valueOf(100), HUNDRED);
		numberWords.put(Integer.valueOf(1000), THOUSAND);
	}


	private Constants() {
	}

}
