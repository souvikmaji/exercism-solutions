import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Anagram {

	private String source;
	private Map<Character, Integer> sourceCount;

	public Anagram(String source) {
		this.source = source;
		this.sourceCount = count(this.source);
	}

	public List<String> match(List<String> targets) {
		List<String> result = new ArrayList<>();
		for (String targetString : targets) {
			if (this.isAnagram(targetString)) {
				result.add(targetString);
			}
		}
		return result;
	}

	private boolean isAnagram(String target) {
		if (this.source.equalsIgnoreCase(target)) {
			return false;
		}

		return this.sourceCount.equals(count(target));
	}

	private Map<Character, Integer> count(String string) {
		Map<Character, Integer> countMap = new HashMap<>();
		for (char character : string.toLowerCase().toCharArray()) {
			int charCount = 1;
			if (countMap.containsKey(character)) {
				charCount = countMap.get(character) + 1;
			}
			countMap.put(character, charCount);
		}
		return countMap;
	}

}