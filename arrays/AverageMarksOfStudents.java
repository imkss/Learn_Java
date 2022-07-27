 package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the number of students : ");
//		
//		int numberOfStudents = sc.nextInt();
//		
//		System.out.println("Enter the marks of the student : ");
//		
//		int marks [] = new int[numberOfStudents];
//				
//		for (int i = 0; i < numberOfStudents; i++) {
//			
//		marks [i] = sc.nextInt();}
//	
//		int average = 0;
//	
//		for(int i = 0; i < numberOfStudents; i ++) {
//			
//		average +=  marks[i];}
//		
//		average /= numberOfStudents;
//		
//		System.out.println("The average marks are " + average);
	
//		int age[] = {12,34,15,3,18,19,75,49};
//		for(int i = 0; i < age.length; i++) {
//			System.out.println(age[i] + " years");
//		}
		
		 System.out.println("Enter the number of students");
		 int n = sc.nextInt();
		 int marks[] = new int[n];
		 for(int i = 0; i < n; i++) {
			 System.out.println("Enter the marks of student");
			 marks[i] = sc.nextInt();
		 }
		 
		 int avg = 0;
		 for(int i = 0; i < n; i++) {
			avg += marks[i];
		 }
		 avg /= n;
	 System.out.println("The average marks of all the students is " + avg);
	
	}

}
