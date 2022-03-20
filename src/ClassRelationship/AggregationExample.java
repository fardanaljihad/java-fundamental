package ClassRelationship;

import java.util.*;
/**
 *
 * @author Fardan
 */
public class AggregationExample {

    public static void main(String[] args) {
        // Instance variables
        Siswa s1 = new Siswa("Siswa 1", "12345");
        Siswa s2 = new Siswa("Siswa 2", "12346");
        Siswa s3 = new Siswa("Siswa 3", "12347");
        Siswa s4 = new Siswa("Siswa 4", "12348");
        Siswa s5 = new Siswa("Siswa 5", "12349");
        
        // Membuat List Anggota Paskibra
        List<Siswa> Paskibra = new ArrayList<Siswa>();
        Paskibra.add(s1);
        Paskibra.add(s2);
        Paskibra.add(s3);
        
        // Membuat List Anggota Pramuka
        List<Siswa> Pramuka = new ArrayList<Siswa>();
        Pramuka.add(s4);
        Pramuka.add(s5);
        
        Ekstrakurikuler ekskul1 = new Ekstrakurikuler("Paskibra", Paskibra);
        Ekstrakurikuler ekskul2 = new Ekstrakurikuler("Pramuka", Pramuka);
        
        // Menampilkan Jumlah Anggota Setiap Ekskul
        System.out.println("Total siswa yang mengikuti ekstrakurikuler " + 
                ekskul1.getNamaEkskul() + " = " + ekskul1.getTotalAnggotaEkskul());
        System.out.println("Total siswa yang mengikuti ekstrakurikuler " + 
                ekskul2.getNamaEkskul() + " = " + ekskul2.getTotalAnggotaEkskul());
        
    }
    
}
