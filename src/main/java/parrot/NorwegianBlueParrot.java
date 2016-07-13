package parrot;

/**
 * Created by toni.tassani on 13/07/2016.
 */
public class NorwegianBlueParrot extends Parrot {

    private double voltage;

    public NorwegianBlueParrot(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return Math.min(24.0, voltage * BASE_SPEED);
    }
}
