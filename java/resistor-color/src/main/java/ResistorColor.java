import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResistorColor {

	private List<String> colorCodes;

	public ResistorColor() {
		this.colorCodes = new ArrayList<>(
				Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"));
	}

	int colorCode(String color) {
		return colorCodes.indexOf(color);
	}

	String[] colors() {
		return this.colorCodes.toArray(new String[0]);
	}
}
