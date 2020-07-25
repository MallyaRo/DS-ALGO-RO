package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n= sc.nextInt();
		System.out.println("Enter the individual marks : ");
		int[] marks = new int[n];
		for(int i = 0 ;i<n ;i++) {
		marks[i] = sc.nextInt();
		}
		int average = 0;
		for(int i =0; i<n;i++) {
			average = average + marks[i];
		}
        average/=n;
        System.out.println(" The average marks are "+ average);
	}

}
