package TInheritance;

/**
 *
 * @author Fardan
 */
public class Animal extends NPC {
    
    /* Instance variables */
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NPC Hewan");
        super.printInfo();
        System.out.println("Habitat     : " + this.habitat);
    }
}
