package parrot;

public abstract class Parrot {

    public static final double BASE_SPEED = 12.0;

    public static Parrot createParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        switch (_type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return (isNailed) ? new NailedNorwegianBlueParrot() : new NorwegianBlueParrot(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    public abstract double getSpeed();

}
