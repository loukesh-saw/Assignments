
/*
 *    Java Assignment for Internship
 *    ------------------------------
 *
 *   Author:
 *   Lokesh Kumar Saw 
 *   9122lav@gmail.com
 *   8016593926
 *
 */

//Assignment.java
package assignment.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment.businessClass.WiseStep_Assignment;
import assignment.businessClass.WiseStep_AssignmentImpl;

public class Assignment1 {
	public static void main(String[] abc) {
		int n = 0;
		Scanner sc = null;
		List<String> empName,output;
		WiseStep_Assignment assign;

		try {
			sc = new Scanner(System.in);
			System.out.println("Input\n--------------------");
			
			// get total no of employee has to be added
			n = sc.nextInt();

			// gather employee's name
			empName=new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				//empName.add(sc.nextLine().toLowerCase());
				empName.add(sc.next().toLowerCase());
			}
			
			//create object of WiseStep_AssignmentImpl class & call compare(-) method
			assign=new WiseStep_AssignmentImpl();
			output=assign.compare(empName);
			
			//print output
			System.out.println("Output\n--------------------");
			for(String str:output) {
				System.out.println(str);
			}//for loop
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null)
				sc.close();
		} // finally
	}// main(-)
}//main class
