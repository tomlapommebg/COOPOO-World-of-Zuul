

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test RoomTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class RoomTest
{
    /**
     * Constructeur de la classe-test RoomTest
     */
    public void NewRoom()
    { Room desert= new Room("desert",null,null);
        
      assertEquals ("desert", desert.getDescription());
    }
      
      public void testRoom1()
    {
        Room desert = new Room("desert",null,null);
        Room entry = new Room("entry",null,null);
        //Room(String description,Item item,Ennemy enemy)

        
        // initialise room exits  
        desert.setExit("west",entry);
        entry.setExit("east", desert);
    }
    public void testsetExit()
    {   Room desert = new Room("desert",null,null);
        Room entry = new Room("entry",null,null);
        
        desert.setExit("north",entry);
        
        assertEquals(desert.getExit("north"),entry);
    
    }
    public void testsetItem()
    {
        // Test the setItemNull, the room should no longer have any item
        Item item1 = new Item("epee");
        Room desert= new Room("desert",item1,null);
        desert.setItem();

        // We check if the item of the room is null
        assertEquals(desert.getItem(),null);
        
    }
    public void setEnnemyNull()
    {
        // Test the setEnnemyNull, the room should no longer have any ennemy
        Enemy mechant = new Ennemy("item","Je suis le méchant",3);
        Room desert = new Room("desert", null, ennemy1);
        desert.setEnemyNull();
        
        // We check if the ennemy of the room is null
        assertEquals(null, desert.getEnnemy());
    }

}
