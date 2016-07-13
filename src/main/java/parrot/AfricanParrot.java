package parrot;

/**
 * Created by toni.tassani on 13/07/2016.
 */
public class AfricanParrot extends Parrot {
    private int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, BASE_SPEED - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() { return 9.0; }
}