import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

    public enum Type {
        EMPTY,
        PACMAN,
        GHOST,
        WALL,
        COOKIE      
    }
    
    private HashMap<Location, HashSet<Type>> field;
    private boolean gameOver;
    private int dim;

    private HashMap<String, Location> locations;
    private HashMap<String, JComponent> components; 
    private HashSet<Type> emptySet;
    private HashSet<Type> wallSet; 

    private int cookies = 0;

    public Map(int dim){
        gameOver = false;
        locations = new HashMap<String, Location>();
        components = new HashMap<String, JComponent>();
        field = new HashMap<Location, HashSet<Type>>();

        emptySet = new HashSet<Type>();
        wallSet = new HashSet<Type>();
        emptySet.add(Type.EMPTY);
        wallSet.add(Type.WALL);
        this.dim = dim;
    }


    public void add(String name, Location loc, JComponent comp, Type type) {
        locations.put(name, loc);
        components.put(name, comp);
        if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
        field.get(loc).add(type);
    }

    public int getCookies() {
        return cookies;
    }
    
    public boolean isGameOver() {
        return gameOver;
    }
        
    public boolean move(String name, Location loc, Type type) {
        //update locations, components, and field
        //use the setLocation method for the component to move it to the new location

        //Replace old location with new one kdkkd 
        Location previous_location = locations.get(name);
        //failed to move if entity is not in the board already 
        if(previous_location == null) {
            return false;
        }
        locations.put(name, loc);

        //Actually moving the entity
        components.get(name).setLocation(loc.x, loc.y);


        //Add in entity to new location and vacate the old one by one entity that moved 
        HashSet<Type> curr_entities_new_location = new HashSet<>();
        if(field.get(loc) != null) {
            curr_entities_new_location = field.get(loc);
        }
        curr_entities_new_location.add(type);
        field.put(loc, curr_entities_new_location);
        HashSet<Type> entities = field.get(previous_location);
        
        //Entity was never there in the field, then failed to move 
        if (entities.remove(type) == false) {
            return false; 
        }
        //Put hashset back with one entity removed 
        field.put(previous_location, entities);

        return true;
    }
    
    public HashSet<Type> getLoc(Location loc) {
        //wallSet and emptySet will help you write this method
        HashSet<Type> entity = new HashSet<>();
        if (loc!= null && field != null && field.get(loc) != null) {
            entity = field.get(loc);
            if (entity.equals(emptySet)) {
                return emptySet;
            } else if(entity.equals(wallSet)) {
                return wallSet;
            } else {
                return entity;
            }
        } else {
            return emptySet;
        }
    }

    public boolean attack(String Name) {
        Location ghost_loc = locations.get(Name);
        boolean gameOver = false;

        if (field.get(new Location(ghost_loc.x + 1,ghost_loc.y)) != null && (field.get(new Location(ghost_loc.x + 1,ghost_loc.y))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x,ghost_loc.y+1)) != null && (field.get(new Location(ghost_loc.x,ghost_loc.y+1))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x - 1,ghost_loc.y)) != null && (field.get(new Location(ghost_loc.x-1,ghost_loc.y))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x,ghost_loc.y-1)) != null && (field.get(new Location(ghost_loc.x,ghost_loc.y-1))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x + 1,ghost_loc.y-1)) != null && (field.get(new Location(ghost_loc.x+1,ghost_loc.y-1))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x - 1,ghost_loc.y-1)) != null && (field.get(new Location(ghost_loc.x-1,ghost_loc.y-1))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x + 1,ghost_loc.y+1)) != null && (field.get(new Location(ghost_loc.x+1,ghost_loc.y+1))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }  

        if (field.get(new Location(ghost_loc.x + 1,ghost_loc.y-1)) != null && (field.get(new Location(ghost_loc.x+1,ghost_loc.y-1))).contains(Map.Type.PACMAN)){
            gameOver = true;
        }

        return gameOver;
    }
    
    public JComponent eatCookie(String name) {
        //update locations, components, field, and cookies
        //the id for a cookie at (10, 1) is tok_x10_y1
        Location pacman_loc = locations.get(name);
        String cookie_name = "tok_x"+pacman_loc.y+"_y"+pacman_loc.x;
        JComponent ret;

        //update field
        HashSet<Type> entities = field.get(pacman_loc);
        if(entities == null && entities.remove(Map.Type.COOKIE)) {
            //update cookies
            cookies++;

            //update components
            ret = components.remove(cookie_name);

            //update locations
            locations.remove(cookie_name);

            field.put(pacman_loc, emptySet);
            
            return(ret);
        }
        return(null);
    }
}

