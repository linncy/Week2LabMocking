package cmput402.mocking;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import service.City;
import stub.CityStub;
import stub.SalaryStub;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void testCapitalizeName() {
    	assert("Abram Hindle".equals(Main.capitalizeName("abram hindle")));
    }
    
    public void testFilterEdmonton() {
    	Util util = new Util();
    	CityStub stub = new CityStub();
    	assert(3==util.filterEdmonton(stub));
    }
    
    public void testFilterSalary50k() {
    	Util util = new Util();
    	SalaryStub salarystub = new SalaryStub();
    	assert(5==util.filterSalary50K(salarystub));
    }
    
    public void testfilterEdmontonMockito() {
    	Util util = new Util();
    	City mockCity = mock(City.class); // an instance of actual City
    	List<String> listCities = new ArrayList<String>();
    	listCities.add("Edmonton");
    	listCities.add("Calgary");
    	listCities.add("Edmonton");
    	listCities.add("Calgary");
    	//whenever you call the method "listCities" of the instance "mockCity", 
    	//listCities will be returned.
    	when(mockCity.listCities()).thenReturn(listCities); // only valid for one call   	
    	assert(2==util.filterEdmonton(mockCity));
    	
    	
    	List<String> listCities2 = new ArrayList<String>();
    	listCities2.add("Edmonton");
    	listCities2.add("Calgary");
    	
    	when(mockCity.listCities()).thenReturn(listCities2);
 
    	
    	assert(1==util.filterEdmonton(mockCity));
    	verify(mockCity,times(2)).listCities(); // You should specify how many times
    }
}
