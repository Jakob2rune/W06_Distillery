import Model.BeerBarel;
import Model.WhiskeyBarel;

public class WhiskeyProducer implements BeverageProducer{
    private int malt = 0;
    private int tmperatur = 0;

    @Override
    public void addMalt(int amountInKg) {
        malt += amountInKg;
    }

    @Override
    public void heatUrd(int temperatur) {
        this.tmperatur=temperatur;
    }

    @Override
    public WhiskeyBarel destillWhiskey(int volumeInliters) {
        int consumption = volumeInliters * 5;
        if(malt < consumption)
            return null;
        malt -= consumption;
        return new WhiskeyBarel( volumeInliters);
    }

    @Override
    public BeerBarel brewBeer(int volumeInliters, float alcoholPercentage) {
        return null;
    }
}
