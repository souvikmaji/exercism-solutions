import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		Map<Character, Integer> countMap = new HashMap<>();

		for (char ch : phrase.toCharArray()) {
			char lowerCaseChar = Character.toLowerCase(ch);
			if (Character.isAlphabetic(lowerCaseChar)) {
				if (countMap.containsKey(lowerCaseChar)) {
					return false;
				}
				countMap.put(lowerCaseChar, 0);
			}

		}
		return true;
	}

}
