package studentDBApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int courseCost = 600;
	private static int id = 1000;
	private Scanner in;

	// Contractor promote name and year
	public Student() {
		in = new Scanner(System.in);
		System.out.print("Enter first Name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter Last Name: ");
		this.lastName = in.nextLine();

		System.out.print(
				"1- freshman" + "\n2- Sophmore" + "\n3- Junior" + "\n4- Senior\n" + "Enter Student Class Level: ");
		this.gradeYear = in.nextInt();
		setStudentId();

	}

	// Generate an Id
	private void setStudentId() {
		id++;
		this.studentID = gradeYear + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0.
		do {
			System.out.print("Enter course to enroll (Q to quit): ");

			in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q") && !course.equals("q")) {
				courses = courses + "\n   " + course;
				tuitionBalance = tuitionBalance + courseCost;
			} else {
				break;
			}
		} while (1 != 0);

	}

	// View balance
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitionBalance);
	}

	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter Your Payment : $");
		in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank You for your payment of $" + payment);

	}

	// show status
	public String toString() {

		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nCourse Enrolled: " + courses
				+ "\nBalance: $" + tuitionBalance;

	}
}
