package TInheritance;

/**
 *
 * @author Fardan
 */
public class Karnivora extends Animal {
    
    /* Instance variables */
    private int ATK;

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("ATK     : " + this.ATK);
    }
}
