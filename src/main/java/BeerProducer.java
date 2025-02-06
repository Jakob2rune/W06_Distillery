import Model.BeerBarel;
import Model.BeerProducerInterface;
import Model.WhiskeyBarel;

public class BeerProducer implements BeerProducerInterface {
    private int malt = 0;
    private int temperatur = 0;

    @Override
    public void addMalt(int amountOfMaltInKg) {
        malt += amountOfMaltInKg;
    }

    @Override
    public void heatUrd(int temperatur) {
        this.temperatur=temperatur;
    }

    @Override
    public BeerBarel brewBeer(int volumeInliters, float alcoholPercentage) {
        int consumption = volumeInliters * 2 * (((int)alcoholPercentage)+1);
        if(malt < consumption){
            System.out.println("You need more malt, less water or select a lower alcohol percentage");
            return null;}
        else{
        malt -= consumption;
        return new BeerBarel( volumeInliters,alcoholPercentage);}

    }

}
