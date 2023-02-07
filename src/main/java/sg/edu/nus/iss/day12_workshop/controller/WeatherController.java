package sg.edu.nus.iss.day12_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

//annotations for the use of controller
@Controller
@RequestMapping("/weather")

public class WeatherController {
    
    @GetMapping
    //functions to retrieve
    //request param didnt specify name for first, by default the name is city
    //second one name is same as variable

    // http://localhost:3000/weather?city=Singapore&units=cm
    public String weather(@RequestParam(required = true) String city, @RequestParam
    (name = "units", defaultValue="kilometres") String units, Model model){
        //data injected to h weather
        model.addAttribute("city", city);
        model.addAttribute("units", units);

        //come to weather page
        return "weather";
    }

    // http://localhost:3000/weather/Singapore?units=cm
    //using path variable instead of param
    //path, no longer a query string
    @GetMapping("{country}")
    public String weather2(@PathVariable(name="country", required = true) String city, @RequestParam
    (name = "units", defaultValue="kilometres") String units, Model model){
        //data injected to h weather
        model.addAttribute("city", city);
        model.addAttribute("units", units);

        //come to weather page
        return "weather";
    }


}
