import Model.BeerBarel;
import Model.WhiskeyBarel;

public interface WhiskeyProducerInterface {

    void addMalt(int amountOfMaltInKg);
    void heatUrd(int temperatur);

    WhiskeyBarel destillWhiskey(int volumeInliters);

}
