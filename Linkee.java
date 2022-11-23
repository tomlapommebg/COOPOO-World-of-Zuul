import java.util.List;
/**
 * Décrivez votre classe Linkee ici.
 *
 * @author (Group 3 -TESSIER)
 * @version (15)
 */
public class Linkee
{
    private Room CurrentRoom;
    private int Weight;
    private int MaxWeight;
    private List<Item> Inventory;
    private String Name;
    private double CaracteristiquePoids;
    private ItemList Inventory;

    


    /**
     * Constructor for objects of class Linkee 
     */
    public Linkee()
    {
        // initialise instance variables
       Name = pName;
       CaracteristiquePoids = pCaracteristiquePoids;
       CurrentRoom = pCurrentRoom;
       Inventory = new ItemList();

    }
     
    public ItemList getInventory() {
       return this.Inventory;
    }
public void setName(final String pName)
   {
      this.Name = pName;
   }
   public String getName()
   {
       return this.Name;
   }
   public void changeRoom(Room nextRoom)
   {
       CurrentRoom = nextRoom;
   }
   public void setCaracteristiquePoids(final double pCaracteristiquePoids)
   {
       this.CaracteristiquePoids = pCaracteristiquePoids;
   }
   public double getCaracteristiquePoids()
   {
       return this.CaracteristiquePoids;
   }
   public void setCurrentRoom(final Room pCurrentRoom)
   {
       this.CurrentRoom = pCurrentRoom;
   }
   public Room getCurrentRoom()
   {
       return this.CurrentRoom;

   }
   public void addItems(String pName, Item pItems)
   {
       this.Inventory.addItem(pName,pItems);
       setCaracteristiquePoids(getCaracteristiquePoids()-pItems.getPoids());
   }
   public boolean getCanAddItem(Item pItems)
   {
       if(getCaracteristiquePoids()>pItems.getPoids())
       {
           return true;
       }
       else return false;
   }
   public void addPoidsInventory(final double pPoids)
   {
       setCaracteristiquePoids(getCaracteristiquePoids() + pPoids);
   }
   public String getItemsString()
   {
       return this.Inventory.getItemString();
   }
   public void removeItem(final String pName,final Item pItem)
   {
       setCaracteristiquePoids(getCaracteristiquePoids()+pItem.getPoids());
       this.Inventory.removeItem(pName);
   }
   public Item getItem(final String pName) {
       return this.Inventory.getItem(pName);
   }




private void takeitem(Command command)
       {
           if(!command.hasSecondWord())
           {
               //Si il n'y pas de second mot
               gui.println("Prendre quoi ?");
               return;
           }
           String nameItem = command.getSecondWord();
           if(player1.getCurrentRoom().getItem(nameItem) == null)
           {
               gui.println("Objet indisponible");
               return;
           }
           Item ItemP = player1.getCurrentRoom().getItem(nameItem);   
           if(player1.getCanAddItem(ItemP) == true)
               {
                   player1.addItems(nameItem, ItemP);
                   player1.getCurrentRoom().removeItem(nameItem);
                   gui.println("Vous avez pris " + (nameItem) + " , tu peux encore prendre dans ton inventaire : " +player1.getCaracteristiquePoids() + "kg.");
               }
               else
               {
                   gui.println("L'inventaire n'est pas assez grand");
               }
            }

    /**
     * 
     */
    public Room getCurrentRoom()
    {
    return CurrentRoom;
    }
    
    /**
     * 
     */
    public int getWeight()
    {
    return Weight;
    }
    
    /**
     * 
     */
    public List<Item> getListItem()
    {
    return Inventory;
    }
    
    /**
     * 
     */
    public void setWeight(int weight) 
    {
       this.Weight = Weight;
      }
    
    /**
     * 
     */
    public void setCurrentRoom(Room CurrentRoom) 
    {
       this.CurrentRoom = CurrentRoom;
    }
    
    /**
     * 
     */
    public void dropItem () 
    {
       
    }
    
    /**
     * 
     */
    public void takeItem () 
    {
       
    }
}