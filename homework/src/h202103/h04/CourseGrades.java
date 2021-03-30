package h202103.h04;

public class CourseGrades implements Analyzable {

	private GradedActivity[] grades = new GradedActivity[4];

	public void setLab(GradedActivity aLab) {
		grades[0] = aLab;
	}

	public void setPfexam(PassFailExam aPassFailExam) {
		grades[1] = aPassFailExam;
	}

	public void setEssay(Essay anEssay) {
		grades[2] = anEssay;
	}

	public void setFinalExam(FinalExam aFinalExam) {
		grades[3] = aFinalExam;
	}

	public String toString() {
		return "Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade() + "\n"
				+ "Pass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade() + "\n"
				+ "Essay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade() + "\n"
				+ "Final Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
	}

	
	
	@Override
	public double getAverage() {
		Double total = 0.0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i].getScore();
		}
		return total / grades.length;
	}

	@Override
	public GradedActivity getHighest() {
		GradedActivity highest = grades[0];
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() > highest.getScore()) {
				highest = grades[i];
			}
		}
		return highest;
	}

	@Override
	public GradedActivity getLowest() {
		GradedActivity lowest = grades[0];
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() > lowest.getScore()) {
				lowest = grades[i];
			}
		}
		return lowest;
	}

}