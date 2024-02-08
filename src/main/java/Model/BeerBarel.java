package Model;

public class BeerBarel {
    private int liters;
    private float percentage;

    public BeerBarel(int liters, float percentage) {
        this.liters = liters;
        this.percentage = percentage;
    }

    @Override
    public String toString()
    {
        return String.format("You produced a %d liters barel of beer with %.2f percentage alcohol", this.liters, this.percentage);
    }
}
