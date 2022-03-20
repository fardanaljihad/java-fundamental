package ClassRelationship;

import java.util.*;

/**
 *
 * @author Fardan
 */
public class Mahasiswa {
    // Attributes/states/data fields
    private String namaMahasiswa;
    private List<MataKuliah> daftarMataKuliah;

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }
}
