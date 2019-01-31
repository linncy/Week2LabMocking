package cmput402.mocking;

import java.util.ArrayList;
import java.util.List;

import service.City;

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

}
