package sg.edu.nus.iss.day12_workshop.repository;

import java.util.*;
import sg.edu.nus.iss.day12_workshop.model.Item; 
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepo {
    private List<Item> itemList;
    public List<Item> getCartItems(){
        //doesnt keep appending
        itemList = new ArrayList<Item>();
        
        //create list of items
        //simulate repository of itmes
        Item itm = new Item();
        

        itm.setItemName("Louis Vuitton");
        itm.setQuantity(5);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Chanel");
        itm.setQuantity(8);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Prada");
        itm.setQuantity(3);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Hermes");
        itm.setQuantity(13);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Bottega");
        itm.setQuantity(18);
        itemList.add(itm);

        return itemList;
    }
}
