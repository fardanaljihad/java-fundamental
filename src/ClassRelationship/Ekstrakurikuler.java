package ClassRelationship;

import java.util.*;
/**
 *
 * @author Fardan
 */
public class Ekstrakurikuler {
    // Attributes
    private String namaEkskul;
    private List<Siswa> daftarAnggota;
    
    // Constructor
    public Ekstrakurikuler(String namaEkskul, List<Siswa> daftarAnggota) {
        this.namaEkskul = namaEkskul;
        this.daftarAnggota = daftarAnggota;
    }
    
    // Methods
    public String getNamaEkskul() {
        return this.namaEkskul;
    }
    
    public int getTotalAnggotaEkskul() {
        int jumlahSiswa=0;
        
        for(Siswa s : daftarAnggota) {
            jumlahSiswa++;
        }
        return jumlahSiswa;
    }
}
