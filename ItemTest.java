

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test ItemTest.
 * This test class will help you to test the fonctionalities of the item class
 * @author  (groupe3)
 * @version (un numéro de version ou une date)
 *
 */
public class ItemTest
{
    /**
     * Constructeur de la classe-test ItemTest
     */
    public void Item() 
    {   
        // Test of the correct functioning of the constructor
        Item item1 = new Item("epee");
        
        // We use the getter to realize the test
        assertEquals("epee", item1.getItemDescription());
    }
    public void Description()
    {
        // Test setDescription, to change the description of an item
        Item item1 = new Item("epee");
        item1.setItemDescription("like a big knife");
        
        // We check if the description is "like a big knife"
        assertEquals("like a big knife", item1.getItemDescription());
    }
    

}