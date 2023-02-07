package sg.edu.nus.iss.day12_workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok library to construct constructers and getters and setters
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Item {

    //create variables- cambelback to be used using JPA
    private String itemName; 
    private Integer quantity; 

}
