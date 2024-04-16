package TInheritance;

/**
 *
 * @author Fardan
 */
public class Character {
    
    /* Instance variabels (state atau data fields) */
    private String nama;
    private int ATK;
    private int DEF;
    private int HP;
    
    /* Getter dan Setter */
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    /* Constructor */
    public Character() {
        this.nama = "";
        this.ATK = 0;
        this.DEF = 0;
        this.HP = 0;
    }
    
    public Character(String nama, int ATK, int DEF, int HP) {
        this.nama = nama;
        this.ATK = ATK;
        this.DEF = DEF;
        this.HP = HP;
    }
    
    /* Behaviors atau Methods */
    public void printCharacter() {
        System.out.println("Nama: " + this.nama);
        System.out.println("ATK         " + this.ATK);
        System.out.println("DEF         " + this.DEF);
        System.out.println("HP          " + this.HP);
    }
    
}
