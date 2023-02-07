package sg.edu.nus.iss.day12_workshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(path="/workshop")

public class WorkshopController {
    //controller to bring us to the screen
    @GetMapping
    //not dynamic
    //displays a page
    //always returns a string
    public String workshop(){
        return "workshop";
    }

    //need to create a mthod to process the number
    @PostMapping("/processNumber")
    public String processNumber(@RequestParam(name = "inputNumber", defaultValue = "1") Integer unit, Model model) {

        List<Integer> lstIngtgers = new ArrayList<Integer>();

        //store it into 
        Integer loopValue = unit;
        Integer currentValue = 1;

        while(currentValue <= loopValue){
            //random num generator
            //can only have up to loopvalue
            //+1 so that it is not 0
            int result = (int) (Math.random() * loopValue) + 1; 

            //check if result is in list of integer
            if (!lstIngtgers.contains(Integer.valueOf(result))){
                //add number
                lstIngtgers.add(Integer.valueOf(result));
                currentValue++;
            }
        }
        //go into a loop
        //add attribute
        model.addAttribute("numbers", lstIngtgers);

        //create workshop result in html page

        //model for data to flow in 
        return "workshopresult";
    }
}
