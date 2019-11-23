public class calcGrade {
	private int quiz1;
	private int quiz2;
	private int quiz3;
	private int midterm;
	private int exam;

	public calcGrade() {
		quiz1 = 0;
		quiz2 = 0;
		quiz3 = 0;
		midterm = 0;
		exam = 0;
	}
	public calcGrade(int q1, int q2, int q3, int mt, int f) {
		quiz1 = q1;
		quiz2 = q2;
		quiz3 = q3;
		midterm = mt;
		exam = f;
	}
	public void setq1(int q1) {
		quiz1 = q1;
	}
	public void setq2(int q2) {
		quiz2 = q2;
	}
	public void setq3(int q3) {
		quiz3 = q3;
	}
	public void setmt(int mt) {
		midterm = mt;
	}
	public void setfinal(int f) {
		exam = f;
	}
	public int getq1() {
		return quiz1;
	}
	public int getq2() {
		return quiz2;
	}
	public int getq3() {
		return quiz3;
	}
	public int getmt() {
		return midterm;
	}
	public int getfinal() {
		return exam;
	}
	public double getQuizGrade() {
		double quizGrade = ((quiz1 + quiz2 + quiz3)/3) * 0.25;
		return quizGrade;
	}
	public double getMTGrade() {
		return midterm * 0.35;
	}
	public double getExamGrade() {
		return exam * 0.4;
	}
	public String getletterGrade(double grade) {
		if (grade >= 90) {
			return "A";
		}
		else if (grade >= 80 && grade < 90) {
			return "B";
		}
		else if (grade >= 70 && grade < 80) {
			return "C";
		}
		else if (grade >= 60 && grade < 70) {
			return "D";
		}
		else {
			return "F";
		}
	}
	public boolean equals(calcGrade grade) {
		if (getQuizGrade() == grade.getQuizGrade() && getMTGrade() == grade.getMTGrade() && getExamGrade() == grade.getExamGrade()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		String output = "";
		output += "Quiz 1: " + getq1();
		output += "\nQuiz 2: " + getq2();
		output += "\nQuiz 3: " + getq3();
		output += "\nMidterm: " + getmt();
		output += "\nExam: " + getfinal();
	}
}