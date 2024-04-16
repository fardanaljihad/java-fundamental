package TInheritance;

/**
 *
 * @author Fardan
 */
public class Archer extends Human {
    /* Instance variables */
    private int accuracy;

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    
    @Override
    public void printCharacter() {
        super.printCharacter();
        System.out.println("Accuracy    " + this.accuracy);
    }
}
