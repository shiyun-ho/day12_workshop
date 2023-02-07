package sg.edu.nus.iss.day12_workshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day12_workshop.repository.ItemRepo;
import java.util.*;
import sg.edu.nus.iss.day12_workshop.model.Item; 

@Service
public class ItemService {
    //can only work when you annotate with @service etc (Only if I have components will this work)
    @Autowired
    //allows us to not instantiate the class, wires up the code that is needed to instantiate the obj
    ItemRepo itmRepo;

    //function to
    public List<Item> retrieveItemList(){
        return itmRepo.getCartItems();
    }
}
