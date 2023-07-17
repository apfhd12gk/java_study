package test;

import school.GenerateGradeReport;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class TestMain {
	School javasc = School.getInstance();
	Subject korean;
	Subject math;

	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) {

		TestMain test = new TestMain();

		test.creatSubject();
		test.creatStudent();

		String report = test.gradeReport.getReport();
		System.out.println(report);

	}

	public void creatSubject() {
		korean = new Subject(Define.KOREAN, "국어");
		math = new Subject(Define.MATH, "수학");

		javasc.addSubject(korean);
		javasc.addSubject(math);
	}

	public void creatStudent() {
		Student student1 = new Student(20203001, "하상인", math);
		Student student2 = new Student(20203010, "김나영", korean);
		Student student3 = new Student(20203008, "최선린", korean);
		Student student4 = new Student(20203065, "배주빈", math);

		javasc.addStudent(student1);
		javasc.addStudent(student2);
		javasc.addStudent(student3);
		javasc.addStudent(student4);

		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);

		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);

		addScoreForStudent(student1, korean, 67);
		addScoreForStudent(student1, math, 98);

		addScoreForStudent(student2, korean, 100);
		addScoreForStudent(student2, math, 88);

		addScoreForStudent(student3, korean, 80);
		addScoreForStudent(student3, math, 70);

		addScoreForStudent(student4, korean, 77);
		addScoreForStudent(student4, math, 88);

	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
