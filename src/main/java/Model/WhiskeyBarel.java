package Model;

public class WhiskeyBarel {
    private int liters;

    public WhiskeyBarel(int liters) {
        this.liters = liters;
    }

    @Override
    public String toString()
    {
        return String.format("You produced a %d liters barel of whiskey", this.liters);
    }
}
