package h202103.h03;

public class FinalExam extends GradedActivity {
	private int numquestions;
	private int nummissed;
	private double eachpoints;

	public FinalExam(int questions, int missed) {
		double numberscore;

		numquestions = questions;
		nummissed = missed;

		eachpoints = 100.0 / questions;
		numberscore = 100.0 - (missed * eachpoints);

		setScore(numberscore);
	}

	public double getPointsEach() {
		return eachpoints;
	}

	public int getNumMissed() {
		return nummissed;
	}
}
