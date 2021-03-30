package h202103.h03;

public class CourseGrades {
	GradedActivity lab;
	PassFailExam pfexam;
	Essay essay;
	FinalExam finalExam;

	public void setLab(GradedActivity lab) {
		this.lab = lab;
	}

	public GradedActivity getLab() {
		return lab;
	}

	public void setPassFailExam(PassFailExam pfexam) {
		this.pfexam = pfexam;
	}

	public PassFailExam getPassFailExam() {
		return pfexam;
	}

	public void setEssay(Essay essay) {
		this.essay = essay;
	}

	public Essay getEssay() {
		return essay;
	}

	public void setFinalExam(FinalExam finalExam) {
		this.finalExam = finalExam;
	}

	public FinalExam getFinalExam() {
		return finalExam;
	}

	public String toString(){
		return "Lab Score: " + lab.getScore() + " Grade: " + lab.getGrade() + "\n" + "Pass/Fail Exam Score: "
				+ pfexam.getScore() + " Grade: " + pfexam.getGrade() + "\n" + "Essay Score: " + essay.getScore()
				+ " Grade: " + essay.getGrade() + "\n" + "Final Exam Score: " + finalExam.getScore() + " Grade: "
				+ finalExam.getGrade();
	}

}