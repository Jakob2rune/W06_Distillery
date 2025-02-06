import Model.BeerBarel;
import Model.WhiskeyBarel;

public class WhiskeyProducer implements WhiskeyProducerInterface{
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
    public WhiskeyBarel destillWhiskey(int volumeInliters) {
        int consumption = volumeInliters * 5;
        if(malt < consumption){
            System.out.println("You need more malt or less water.");
            return null;}
        else {
        malt -= consumption;
        return new WhiskeyBarel( volumeInliters);}
    }
}
