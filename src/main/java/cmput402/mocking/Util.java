package cmput402.mocking;

import java.util.ArrayList;
import java.util.List;

import service.City;
import service.Salary;

public class Util {
	
	public int filterEdmonton(City city) {
		int count=0;
		
		List<String> cities = new ArrayList<String>();
		
		cities=city.listCities(); //The service interface can return you cities 
		// This statement is interface-agnostic: Both service and stub have city implementations.
		
		for(String aCity: cities) {
			if(aCity.equals("Edmonton")) {
				count++;
			}
		}
		return count;
	}
	
	public int filterSalary50K(Salary salary) {
		int count=0;
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries=salary.returnSalaries();
		for(int item: salaries) {
			if(item>50000) {
				count++;
			}
		}
		return count;
	}

}
