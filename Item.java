import java.util.*;
import java.lang.*;

/**
 * This class represents the mother class of the possible items that Linkee
 * can use during his adventure : The choice between 3 Items is given to the 
 * player after defeating the mummies
 *
 * @author Mounia
 * @version 15/11/2022
 */
public class Item
{
    private String itemName;
    private String itemDescription;
    private int itemWeight;
    
    /**
     * Constructor of the object from the Item class
     * 
     * @name is the name of the item
     * @description is the description given to the item
     * @weight is the weight of the item
     */
    public Item(String name, String description, int weight)
    {
        itemName = name;
        itemDescription = description;
        weight = itemWeight;
    }

    /**
     * Getter of the item Name 
     * 
     * @return     returns the name of the item 
     */
    public String getItemName()
    {
        return itemName;
    }
    /**
     * Setter of the item description
     *
     * @return     returns the description of the item
     */
    public void setItemDescription(String ItemDescription)
    {
        this.itemDescription = itemDescription;
    }
    /**
     * Getter of the item description
     *
     * @return     returns the description of the item
     */
    public String getItemDescription()
    {
        return itemDescription;
    }
    
    /**
     * Getter of the item's weight 
     *
     * @return     returns the weight of the item
     */
    public int getItemWeight()
    {
        return itemWeight;
    }
    
    
}
