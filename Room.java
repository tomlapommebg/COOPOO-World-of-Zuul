import java.util.HashMap;
import java.util.Set;
/**
 *  This class manages the description and every components of each rooms where linkee is. 
 * @author (groupe 3)
 * @version (un numéro de version ou une date)
 */
public class Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String description;
    private Item item; 
    private Enemy enemy;
    private HashMap<String, Room> exits;
    

    /**
     * Constructeur d'objets de classe Room
     */
public Room()
    {
        // Initialisation of the description
        this.description = description;
        
        // Initialisation of the level 
        //this.level = level;
        
        // Initialisation of the Item : is null if no item in the room
        this.item = item;
        
        // Initialisation of the enemy : is null if no enemy in the room
        this.enemy = enemy;
        
        exits = new HashMap <>();
    }

    /**
     * Method setExit: defines an exit from this room
     */
public void setExit(String direction, Room nextRoom){
            exits.put(direction, nextRoom);
    }
    /** Method getExit: returns the room that we reach in the given direction
     * If there is no room in that direction, returns null
     */
public Room getExit(String direction){
            return exits.get(direction);
    }
    ///**
     //* Method getLevel: return the level of the room in the pyramid 
     //*/
//public int getLevel(){
  //      return level;
    //}
 /**
     * Method getDescription : return the description of the current
     * Room
    */
public String getDescription(){
        return description;
    }
    
/**
     * method getNextRoom : return the nextroom depending on the direction chosen
     */
    public Room getNextRoom(String direction){
       Room nextRoom = null;
        
      //  for(String i : exits()) 
      //  {
      //      if(direction==i){
                 
                
      //              //then the user can go in this room
      //              nextRoom = exits.get(i);
                
       //     }
       //     else{
       //         //do nothing : the room was not found, so still null
      //      }
      //  }
        
       return nextRoom;
        
}

/**
 * Method getItem : return the item that are in the current room
 */
    public Item getItem(){
        return(item);
    }
/**
 * Method getEnnemy : return the name of the ennemy in the room 
 */
    public Enemy getEnnemy(){
        return(enemy);
    }
}
