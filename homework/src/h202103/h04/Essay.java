package h202103.h04;

public class Essay extends GradedActivity {
	private double grammar;
	private double spelling;
	private double correctlength;
	private double content;

	public void setScore(double gra, double spe, double leng, double con) {
		setGrammar(gra);
		setSpelling(spe);
		setCorrectlength(leng);
		setContent(con);
		super.setScore(grammar + spelling + correctlength + content);
	}

	private void setGrammar(double g) {
		if (g <= 30)
			grammar = g;
		else
			grammar = 0;
	}

	private void setSpelling(double s) {
		if (s <= 20)
			spelling = s;
		else
			spelling = 0;
	}

	private void setCorrectlength(double c) {
		if (c <= 20)
			correctlength = c;
		else
			correctlength = 0;
	}

	private void setContent(double o) {
		if (o <= 30)
			content = o;
		else
			content = 0;
	}

	public double getGrammar() {
		return grammar;
	}

	public double getSpelling() {
		return spelling;
	}

	public double getCorrrectlength() {
		return correctlength;
	}

	public double getContent() {
		return content;
	}

	public double getScore()// in order to get the score
	{
		return grammar + spelling + correctlength + content;
	}

}