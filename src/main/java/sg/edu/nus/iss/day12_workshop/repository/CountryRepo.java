package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;
//import model class
import sg.edu.nus.iss.day12_workshop.model.*;


public class CountryRepo {
    List<Country> countryList;

    public List<Country> getAllCountries(){
        countryList = new ArrayList<Country>();
        Country cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);
        cty = new Country("MY", "Malaysia", 33000000);
        countryList.add(cty);
        cty = new Country("CN", "China", 798000000);
        countryList.add(cty);
        cty = new Country("HK", "Hong Kong", 700000);
        countryList.add(cty);

        return countryList;
    }

    public Boolean createCountry(Country cty){
        //instantuate array
        if(countryList == null){
            //instantiate cty
            countryList = new ArrayList<Country>();
        }
        
        countryList.add(cty);
        return true;

    }
}
