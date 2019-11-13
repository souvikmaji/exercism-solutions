import java.util.ArrayList;
import java.util.List;

class LuhnValidator {

	private int valueOf(int x, int position) {
		if (position % 2 == 0) {
			int doubleOf = x * 2;
			if (doubleOf > 9) {
				return doubleOf - 9;
			}
			return doubleOf;
		}
		return x;
	}

	boolean isValid(String candidate) {
		String trimmed = candidate.replaceAll(" ", "");
		if (trimmed.length() < 2) {
			return false;
		}

		List<Integer> candidateList = new ArrayList<>();
		for (char c : trimmed.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
			candidateList.add(Character.digit(c, 10));
		}

		int sum = 0;
		for (int i = 0; i < candidateList.size(); i++) {
			sum += valueOf(candidateList.get(candidateList.size() - i - 1), i + 1);
		}

		return sum % 10 == 0;
	}

}
