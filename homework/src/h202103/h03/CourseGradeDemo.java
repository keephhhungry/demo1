package h202103.h03;

public class CourseGradeDemo {
	public static void main(String[] args) {
		GradedActivity lab = new GradedActivity();
		lab.setScore(85);

		PassFailExam pfexam = new PassFailExam(20, 3, 70);

		Essay essay = new Essay();
		essay.setScore(25, 18, 17, 20);

		FinalExam finalExam = new FinalExam(50, 10);

		CourseGrades course = new CourseGrades();
		course.setLab(lab);
		course.setPassFailExam(pfexam);
		course.setEssay(essay);
		course.setFinalExam(finalExam);

		System.out.println(course);
	}
}