package TInheritance;

/**
 *
 * @author Fardan
 */
public class NPC {
    
    /* Instance variables */
    private String name;
    private int HP;
    
    /* Getter dan Setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void printInfo() {
        System.out.println("Nama    : " + this.name);
        System.out.println("HP      : " + this.HP);
    }
}
