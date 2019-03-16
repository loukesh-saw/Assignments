

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

package assign.wiseStep;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



//WiseStep_Assignment.java

public class WiseStep_Assignment {
	public static void main(String[] abc) {
		int n = 0;
		Scanner sc = null;
		List<String> empName,output;
		WiseStep_AssignmentImpl assign;

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








//WiseStep_AssignmentImpl.java(business class)

class WiseStep_AssignmentImpl {

	public List<String> compare(List<String> empName)throws Exception {
		List<String> result=new ArrayList<String>();
		String[] name=new String[empName.size()];
		for(int i=0; i<empName.size(); i++) {
			name[i]=empName.get(i);
		}
		for (int i = 0; i <name.length ; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {

				// check either employee is already added or not
				if (name[i].equals(name[j])) {
					flag = false;
				}
			} // nested for loop

			// add response to result
			if (flag) {
				result.add("NO");
			} else {
				result.add("YES");
			}
		} //for loop
		return result;
	}//compare
}//WiseStep_AssignmentImpl



