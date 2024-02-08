import Model.BeerBarel;
import Model.WhiskeyBarel;

public class BeerProducer implements BeverageProducer{
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
        return null;
    }

    @Override
    public BeerBarel brewBeer(int volumeInliters, float alcoholPercentage) {
        int consumption = volumeInliters * 2 * (((int)alcoholPercentage)+1);
        if(malt < consumption)
            return null;
        malt -= consumption;
        return new BeerBarel( volumeInliters,alcoholPercentage);

    }
}
