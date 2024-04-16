package TInheritance;

/**
 *
 * @author Fardan
 */
public class Witch extends Character implements IFly {
    
    /* Instance variables (state atau data fields) */
    private int MagicATK;
    private int MagicDEF;
    
    /* Getter dan Setter */
    public int getMagicATK() {
        return MagicATK;
    }

    public void setMagicATK(int MagicATK) {
        this.MagicATK = MagicATK;
    }

    public int getMagicDEF() {
        return MagicDEF;
    }

    public void setMagicDEF(int MagicDEF) {
        this.MagicDEF = MagicDEF;
    }
    
    /* Constructor */
    public Witch() {
        super();
        this.MagicATK = 0;
        this.MagicDEF = 0;
    }
    
    public Witch(String nama, int ATK, int DEF, int HP, int MagicATK, int MagicDEF) {
        super(nama, ATK, DEF, HP);
        this.MagicATK = MagicATK;
        this.MagicDEF = MagicDEF;
    }
    
    /* Behavior atau methods */
    @Override
    public void printCharacter() {
        System.out.println("Penyihir");
        super.printCharacter();
        System.out.println("Magic ATK   " + this.MagicATK);
        System.out.println("Magic DEF   " + this.MagicDEF);
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
