package code;
import java.util.HashMap;
public class code5 {
static HashMap<String,String> countryMap;

	public static void main(String[] args) {
		code5 obj = new code5();
		
		countryMap = new HashMap<String,String>();
		
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Japan","Tokyo");
		obj.saveCountryCapital("Bangladesh","Dhaka");
		obj.saveCountryCapital("China", "Biging");
		
		
	}
	
	public HashMap saveCountryCapital(String country,String capital) {
		
		countryMap.put(country, capital);
		
		return countryMap;
	}
	
	public String getCountry(String capital) {
		
		return "india";
	}
    public String getCapital(String country) {
    	
    	return "";
    }
}

