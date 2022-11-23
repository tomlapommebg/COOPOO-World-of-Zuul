import java.util.*;
import java.lang.*;

/**
 * This class represents the mother class of the possible items that Linkee
 * can use during his adventure : The choice between 3 Items is given to the 
 * player after defeating the mummies
 *
 * @author 
 * @version 
 */
public class Item
{
    private String itemName;
    private String itemDescription;
    private int itemWeight;
    private String aDescription;
    private double aPoids;
    private String aName;

       public Item(final double pPoids, final String pDescription, final String pName)
   {
       this.aPoids=pPoids;
       this.aDescription=pDescription;
this.aName=pName;
   }
   public String getLongDescription()
   {
       return this.aDescription + " de " + this.aPoids + " kg";
   }
   public void setDescription(final String pDescription)
   {
       this.aDescription = pDescription;
   }
   public String getDescription()
   {
       return this.aDescription;
   }
   public void setPoids(final double pPoids)
   {
       this.aPoids = pPoids;
   }   
   public double getPoids()
   {
       return this.aPoids;
   }
public void setName(final String pName)
   {
       this.aName=pName;
   }
   public String getName()
   {
       return this.aName;
   }   




public String getLongDescription()
   {
       return this.aDescription + " de " + this.aPoids + " kg";
   }


public void addItem(final String pName, final Item pItem)
   {
       this.items.addItem(pName,pItem);
   }


//tombeau.addItem("Diamant",new Item(4,"brillant","Diamant"));
//momification.addItem("Corde",new Item(4,"sortie","Corde"));
//momification.addItem("Epee",new Item(4,"degat","Epee"));
//momification.addItem("Potion",new Item(4,"vie","Potion"));
//chambre.addItem("Key",new Item(4,"debloque","Key"));

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
