import java.util.ArrayList;
/**
 * Here we have the Weapons
 *
 * @author Grp3
 * @version 15/11/2022
 */
public class Weapons extends Item
{
    
    private String name;
    private Integer damage;

    /**
     * Constructeur d'objets de classe Weapons
     */
    public Weapons(String nameItem,String description, int w )
    {
        super(nameItem, description, w);
        
        
    }

    /**
     * Return the name
     */
    public String getName()
    {
    
        return itemName;
    }
    /**
     * Return Damage point of the item
     */
    public int getDamage()
    {
        //
        return damage;
    }

}
