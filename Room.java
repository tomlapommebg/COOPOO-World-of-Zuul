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
    
private void createRooms()
   {
       Room desert, entree, momification, hieroglyphes, tresor, scarabe, enigme, chambre, tombeau;
       // create the rooms
       desert = new Room("dans le désert");
       entree = new Room("dans la pyramide du Pharaon");
       momification = new Room("dans la salle de momification");
       hieroglyphes = new Room("dans la salle des hieroglyphes");
       tresor = new Room("dans la salle des tresors");
       scarabe = new Room("dans la salle des scarabes");
       enigme = new Room("etes dans la salle des enigmes");
       chambre = new Room("dans la chambre du pharaon");
       tombeau = new Room("dans le tombeau du Pharaon");
              // initialise room exits
       desert.setExits(entree, null, null, null);
       entree.setExits(null, momification, desert, hierogliphes);
       momification.setExits(enigme, tresor, null, entree);
       hieroglyphes.setExits(null, entree, null, null);
       tresor.setExits(null, entree, null, momification);
       enigme.setExits(chambre, scarabe, momification, null);
       scarabe.setExits(null, null, null, enigme);
       chambre.setExits(tombeau, null, enigmel, null);
       tombeau.setExits(sortie, null, null, null);
       currentRoom = desert;  // start game outside
   }


private void printWelcome()
   {
       System.out.println();
       System.out.println("Bienvenue dans Linkee et la légende du diamant");
       System.out.println("Linkee et la légende du diamant est un formidable jeu d'aventure");
       System.out.println("Type'help' if you need help.");
       System.out.println();
       System.out.println("Vous etes " + currentRoom.getDescription());
       System.out.print("Exits: ");
       if(currentRoom.northExit != null)
           System.out.print("north ");
       if(currentRoom.eastExit != null)
           System.out.print("east ");
       if(currentRoom.southExit != null)
           System.out.print("south ");
       if(currentRoom.westExit != null)
           System.out.print("west ");
       System.out.println();
   }


private void printLocationInfo ()
   {
      System.out.println("Vous etes " + currentRoom.getDescription());
       System.out.print("Exits: ");
       if(currentRoom.northExit != null)
           System.out.print("north ");
       if(currentRoom.eastExit != null)
           System.out.print("east ");
       if(currentRoom.southExit != null)
           System.out.print("south ");
       if(currentRoom.westExit != null)
           System.out.print("west ");
       System.out.println();
   }



public Room getExit (String direction)
   {
       if (direction.equals("north"))
       {
           return northExit;
       }
        if (direction.equals("east"))
       {
           return eastExit;
       }
        if (direction.equals("south"))
       {
           return southExit;
       }
        if (direction.equals("west"))
       {
           return westExit;
       }
       return null;
   }

Room nextRoom = currentRoom.getExit(direction);


public String getExitString(){
String exit = "Exits: ";
if(northExit !=null)
exit +="north";
if(eastExit != null)
exit +="east";
if(southExit != null)
exit+="south";
if(westExit != null)
exit +="west";
return exit;
}

//public String getLongDescription()
  // {
  //     return "Vous etes " + description + " "  + getExitString()
  //  }
    
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
