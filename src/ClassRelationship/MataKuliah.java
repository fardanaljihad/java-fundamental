package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class MataKuliah {
    // Attributes/states/data fields
    private String namaMataKuliah;

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }
    
    @Override
    public String toString() {
        return namaMataKuliah;
    }
}
