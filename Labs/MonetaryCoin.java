public class MonetaryCoin extends Coin {
    private int value;

    public MonetaryCoin(int value) throws IllegalMonetaryAmount {
        if (value < 1 || value > 100) {
            throw new IllegalMonetaryAmount("Value must be between 1 and 100 cents.");
        }
        this.value = value;
        flip();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws IllegalMonetaryAmount {
        if (value < 1 || value > 100) {
            throw new IllegalMonetaryAmount("Value must be between 1 and 100 cents.");
        }
        this.value = value;
    }

    public String toString() {
        return "(" + value + "¢, " + super.toString() + ")";
    }
}
