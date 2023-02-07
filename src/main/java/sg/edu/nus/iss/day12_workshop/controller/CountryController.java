package sg.edu.nus.iss.day12_workshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.day12_workshop.model.Country;
import sg.edu.nus.iss.day12_workshop.service.CountryService;

@Controller
@RequestMapping(path = {"countries"})

public class CountryController {
    CountryService ctySvc;

    //constructor
    public CountryController(){
        ctySvc = new CountryService();
    }

    //format xml
    //returns list of country
    // @GetMapping(produces = {"application/xml"})
    //data in json

    //when in postman GET 
    @GetMapping
    public @ResponseBody List<Country> getAllCountries(){
        return ctySvc.getAllCountries();
    }

    //creates a new record
    @PostMapping()
    public @ResponseBody Boolean createCountry(@RequestBody Country cty){
        return ctySvc.createCountry(cty);
    }

    // @GetMapping("/list")
    // public String displayCountryList(Model model){
    //     //project to page to be displayed
    //     List<Country> ctyList = ctySvc.getAllCountries(); 
    //     model.addAttribute("countryList", ctyList);

    //     return "countryList"; 
    // }

    //displays webpage
    @RequestMapping(path ="/list", method = RequestMethod.GET)
    public String displayCountryList(Model model){
        //project to page to be displayed
        List<Country> ctyList = ctySvc.getAllCountries(); 
        model.addAttribute("countryList", ctyList);

        return "countryList"; 
    }
}
