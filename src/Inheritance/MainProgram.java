package TInheritance;

/**
 *
 * @author Fardan
 */
public class MainProgram {

    public static void main(String[] args) {
        
        /* Instance Object */
        Character c = new Character();
        c.setNama("Karakter1");
        c.setATK(80);
        c.setDEF(75);
        c.setHP(100);
        
        Human h = new Human();
        h.setNama("Human1");
        h.setATK(95);
        h.setDEF(90);
        h.setHP(100);
        
        Witch w = new Witch();
        w.setNama("Witch1");
        w.setATK(30);
        w.setDEF(25);
        w.setHP(85);
        
        Character c2 = new Character("Karakter2", 75, 70, 100);
        
        Witch w2 = new Witch("Witch2", 35, 55, 100, 90, 75);
        
        c.printCharacter();
        System.out.println();
        h.printCharacter();
        System.out.println();
        w.printCharacter();
        System.out.println();
        c2.printCharacter();
        System.out.println();
        w2.printCharacter();
    }
    
}
