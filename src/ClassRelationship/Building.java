package ClassRelationship;

import java.util.*;
/**
 *
 * @author Fardan
 */
public class Building {
    private final List<Room> rooms;
    
    public Building(List<Room> rooms) {
        this.rooms = rooms;
    }
    
    public List<Room> getTotalRoomsInBuilding(){
        return rooms;
    }
}
