package ClassDesignHints;

/**
 *
 * @author Fardan
 */
public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    
    // Constructor
    public Itachi() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    
    void printDojutsu() {
        System.out.println(super.Dojutsu);
        System.out.println(this.Dojutsu);
    }
    
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }

}
