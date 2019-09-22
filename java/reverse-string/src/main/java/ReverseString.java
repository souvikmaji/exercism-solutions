class ReverseString {

	String reverse(String inputString) {

		char[] inputStringArray = inputString.toCharArray();

		int n = inputStringArray.length;
		for (int i = 0; i < n / 2; i++) {
			char temp = inputStringArray[i];
			inputStringArray[i] = inputStringArray[n - i - 1];
			inputStringArray[n - i - 1] = temp;
		}

		return new String(inputStringArray);
	}

}