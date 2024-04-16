package TInheritance;

/**
 *
 * @author Fardan
 */
public class Human extends Character {
    
    /* Instance Variables */
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public void printCharacter() {
        System.out.println("Human");
        System.out.println("Gender  : " + this.gender);
        super.printCharacter();
    }
            
}
