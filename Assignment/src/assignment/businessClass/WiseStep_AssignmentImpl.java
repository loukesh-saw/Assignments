package assignment.businessClass;

import java.util.ArrayList;
import java.util.List;

public class WiseStep_AssignmentImpl implements WiseStep_Assignment {

	@Override
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
