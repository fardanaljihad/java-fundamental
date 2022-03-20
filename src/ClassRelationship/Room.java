package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class Room {
    // Attributes
    private String namaRuangan;
    private String kodeRuangan;
    
    // Constructor
    public Room(String namaRuangan, String kodeRuangan) {
        this.namaRuangan = namaRuangan;
        this.kodeRuangan = kodeRuangan;
    }
    
    public String getNamaRuangan() {
        return this.namaRuangan;
    }
}
