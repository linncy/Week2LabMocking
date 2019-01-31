package stub;

import java.util.ArrayList;

import service.Salary;

public class SalaryStub implements Salary {

	public ArrayList<Integer> returnSalaries() {
		// TODO Auto-generated method stub
		ArrayList<Integer> salary = new ArrayList<Integer>();
		salary.add(10000);
		salary.add(20000);
		salary.add(30000);
		salary.add(40000);
		salary.add(50000);
		salary.add(60000);
		salary.add(70000);
		salary.add(80000);
		salary.add(90000);
		salary.add(100000);
		return salary;
	}

}
