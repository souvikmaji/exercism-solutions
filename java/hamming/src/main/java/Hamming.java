class Hamming {

	private int hammingDistance;

	Hamming(String leftStrand, String rightStrand) {
		checkValidity(leftStrand, rightStrand);

		this.hammingDistance = calculateDistance(leftStrand, rightStrand);

	}

	private void checkValidity(String leftStrand, String rightStrand) {
		if (leftStrand == null || leftStrand.isEmpty() && rightStrand != null && !rightStrand.isEmpty()) {
			throw new IllegalArgumentException("left strand must not be empty.");
		}
		if (rightStrand == null || rightStrand.isEmpty() && !leftStrand.isEmpty()) {
			throw new IllegalArgumentException("right strand must not be empty.");
		}
		if (leftStrand.length() != rightStrand.length()) {
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
	}

	public int getHammingDistance() {
		return this.hammingDistance;
	}

	private int calculateDistance(String leftStrand, String rightStrand) {
		int count = 0;
		for (int i = 0; i < leftStrand.length(); i++) {
			if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
				count++;
			}
		}

		return count;
	}

}
