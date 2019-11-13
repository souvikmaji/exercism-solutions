class ResistorColorDuo {
	enum Color {
		BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
	}

	int getResistorValue(String color) {
		return Color.valueOf(color.toUpperCase()).ordinal();
	}

	int value(String[] colors) {
		StringBuilder val = new StringBuilder();

		val.append(getResistorValue(colors[0]));
		val.append(getResistorValue(colors[1]));
	
		return Integer.parseInt(val.toString());
	}
}
