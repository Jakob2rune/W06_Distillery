import Model.BeerBarel;
import Model.WhiskeyBarel;

public interface BeverageProducer {

    void addMalt(int amountInKg);
    void heatUrd(int temperatur);

    WhiskeyBarel destillWhiskey(int volumeInliters);
    BeerBarel brewBeer(int volumeInliters, float alcoholPercentage);


}
