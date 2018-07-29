package studentDBApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// ask how many users want to add
		System.out.print("Please Entet The number of Student: ");
		Scanner in = new Scanner(System.in);
		int numOfStundes = in.nextInt();
		Student[] students = new Student[numOfStundes];

		// Create n number of new students

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();

		}
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}

	}

}
