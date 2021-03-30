package h202103.h04;

public class GradedActivity {
	private double score;

	public void setScore(double s) {
		score = s;
	}

	public double getScore() {
		return score;
	}

	public char getGrade() {
		char lettergrade;
		if (score >= 90)
			lettergrade = 'A';
		else if (score >= 80)
			lettergrade = 'B';
		else if (score >= 70)
			lettergrade = 'C';
		else if (score >= 60)
			lettergrade = 'D';
		else
			lettergrade = 'F';
		return lettergrade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GradedActivity [score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}
	
	
}