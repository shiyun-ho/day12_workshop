package sg.edu.nus.iss.day12_workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


import sg.edu.nus.iss.day12_workshop.service.ItemService;
import sg.edu.nus.iss.day12_workshop.model.Item;
import org.springframework.ui.Model;
import java.util.stream.Collectors;

//annotate to know that it is controller
@Controller
//specify path
@RequestMapping(path = {"/shoppingcart"})

public class ItemController {
    @Autowired
    ItemService itmSvc;
//display html page
    @GetMapping(produces = "text/html")
    //need a function to display the page
    public String displayCart(Model model){
        //call the service
        List<Item> items = itmSvc.retrieveItemList(); 
        model.addAttribute("cartItems", items);
        return "cartList";
    }

    //when /prada, only shows prada
    @GetMapping("{itemname}")
    public String filteredCart(@PathVariable("itemname") String itemname, Model model){
        //filter away the records
        List<Item> items = itmSvc.retrieveItemList(); 
        List<Item> foundItem = items.stream().filter(i -> i.getItemName().equalsIgnoreCase(itemname)).
        collect(Collectors.toList());
        model.addAttribute("cartItems", foundItem);
        
        return "cartList";
    }

}
