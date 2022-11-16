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

    /**
     * Constructor for objects of class Linkee 
     */
    public Linkee()
    {
        
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