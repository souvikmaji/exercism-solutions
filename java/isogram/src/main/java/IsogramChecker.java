import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		Set<Character> countMap = new HashSet<>();

		for (char ch : phrase.toCharArray()) {

			if (Character.isAlphabetic(ch) && !countMap.add(Character.toLowerCase(ch))) {
				return false;
			}

		}
		return true;
	}

}
