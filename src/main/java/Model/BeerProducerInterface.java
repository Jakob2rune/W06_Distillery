package Model;

public interface BeerProducerInterface {

    void addMalt(int amountOfMaltInKg);
    void heatUrd(int temperatur);

    BeerBarel brewBeer(int volumeInliters, float alcoholPercentage);

}
