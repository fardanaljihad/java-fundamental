package TInheritance;

/**
 *
 * @author Fardan
 */
public class MainProgram2 {

    public static void main(String[] args) {
        // Instance Object
        Archer a = new Archer();
        a.setNama("Archer1");
        a.setGender("M");
        a.setATK(90);
        a.setDEF(80);
        a.setHP(100);
        a.setAccuracy(90);
        
        a.printCharacter();
    }
    
}
