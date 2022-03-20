package ClassRelationship;

import java.util.*;
/**
 *
 * @author Fardan
 */
public class MainAssociation {

    public static void main(String[] args) {
        // Attributes
        Mahasiswa Mhs1 = new Mahasiswa();
        Mhs1.setNamaMahasiswa("Mahasiswa 1");
        
        MataKuliah MK1 = new MataKuliah();
        MK1.setNamaMataKuliah("Teknik Pemrograman");
        MataKuliah MK2 = new MataKuliah();
        MK2.setNamaMataKuliah("Struktur Data dan Algoritma");
        MataKuliah MK3 = new MataKuliah();
        MK3.setNamaMataKuliah("Proyek 1");
        
        List<MataKuliah> empList = new ArrayList<MataKuliah>();
        empList.add(MK1);
        empList.add(MK2);
        empList.add(MK3);
        
        Mhs1.setDaftarMataKuliah(empList);
        
        System.out.println(Mhs1.getDaftarMataKuliah() + 
                " adalah mata kuliah yang diambil " + Mhs1.getNamaMahasiswa());
    }
}
