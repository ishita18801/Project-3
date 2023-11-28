package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentID;
	private String courses = " ";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor: prompts user to enter student's name and year
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName=sc.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName=sc.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear=sc.nextInt();
		
		setStudentId();
		
}
	
	// Generate an ID
	private void setStudentId() {
	//	Grade Level + ID
		id++;
		this.StudentID= gradeYear+""+id;
		
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		
		do {
		System.out.print("Enter course to enroll(Q to quit):");
		Scanner sc=new Scanner(System.in);
		String course = sc.nextLine();
	if(!course.equals("Q")) {
		courses = courses+"\n  "+course;
		tuitionBalance= tuitionBalance+ costOfCourse;
	}
	else {
		break;
		}
}
		while(1!=0);
	
}	
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your Balance is: Rs." + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: Rs.");
		Scanner sc=new Scanner(System.in);
		int payment =sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Rs."+ payment);
		viewBalance();
		
	}
	
	//Show status
    public String toString() {
    	return "Name: " + firstName + " " + lastName + "\nGrade Level:" + gradeYear + "\nStudentID:"+ StudentID + "\nCourses Enrolled: " + courses + "\nBalance: Rs." + tuitionBalance;
    	
    }
}
