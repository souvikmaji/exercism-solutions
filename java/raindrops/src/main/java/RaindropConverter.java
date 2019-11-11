import java.util.Optional;

class RaindropConverter {

	private static final String PLONG = "Plong";
	private static final String PLANG = "Plang";
	private static final String PLING = "Pling";

	private boolean isDivisible(int number, int divisor) {
		return number % divisor == 0;
	}

	private Optional<String> getDivisorString(int number) {
		StringBuilder s = new StringBuilder();

		if (isDivisible(number, 3)) {
			s.append(PLING);
		}
		
		if (isDivisible(number, 5)) {
			s.append(PLANG);
		}
		
		if (isDivisible(number, 7)) {
			s.append(PLONG);
		}

		if (s.length() > 0) {
			return Optional.of(s.toString());
		}
		
		return Optional.empty();
	}
	
	String convert(int number) {
		return getDivisorString(number).orElse(String.valueOf(number));
	}

	

}
