package h202103.h04;

public class PassFailActivity extends GradedActivity {
	private double minPassScore;

	public PassFailActivity(double mps) {
		minPassScore = mps;
	}

	public char getGrade() {
		char lettergrade;

		if (super.getScore() >= minPassScore)
			lettergrade = 'P';
		else
			lettergrade = 'F';

		return lettergrade;
	}
}