package sg.edu.nus.iss.day12_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;


//annotate the class with @Controller
@Controller
//annotate with RequestMapping - as long as the user keys in home or index, it will show
@RequestMapping(path={"/home", "/index"})
public class HomeController {
    //get request to display page
    @GetMapping()
    //need a public string
    //parse data into the form 
    public String home(Model model){
        Calendar cal = Calendar.getInstance();
        
        model.addAttribute("currTime", new Date().toString());
        //add time
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));
        //return string of index.html
        return "index"; 
    }

    
}
