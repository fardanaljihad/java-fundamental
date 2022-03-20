package ClassRelationship;

import java.io.*;
import java.util.*;
/**
 *
 * @author Fardan
 */
public class CompositionExample {

    public static void main(String[] args) {
        // TODO code application logic here
        Room r1 = new Room("Lab. Komputer", "L001");
        Room r2 = new Room("Lab. Bahasa", "L002");
        Room r3 = new Room("Lab. Fisika", "L003");
        Room r4 = new Room("Ruang Kelas", "K001");
        Room r5 = new Room("Ruang Guru", "G001");
        
        List<Room> rooms = new ArrayList<Room>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        rooms.add(r5);
        
        Building school = new Building(rooms);
        
        List<Room> rms = school.getTotalRoomsInBuilding();
        System.out.println("Daftar Ruangan Sekolah A:");
        for(Room rm : rms) {
            System.out.println(rm.getNamaRuangan());
        }
    }
    
}
