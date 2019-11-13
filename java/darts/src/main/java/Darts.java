class Darts {

	private int score;

	public Darts(double x, double y) {
		this.score = calculateScore(calculateDistance(x, y));
	}

	private int calculateScore(double distance) {
		if (distance <= 1) {
			return 10;
		}
		if (distance <= 5) {
			return 5;
		}
		if (distance <= 10) {
			return 1;
		}

		return 0;
	}

	private double calculateDistance(double x, double y) {
		return Math.hypot(x, y);
	}

	public int score() {
		return this.score;
	}

}
