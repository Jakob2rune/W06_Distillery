import Model.BeerBarel;
import Model.BeerProducerInterface;
import Model.WhiskeyBarel;

public class BeverageFactory {

     public static void main(String[] args) {
         BeverageFactory bf = new BeverageFactory();

         bf.makeWhiskey(new WhiskeyProducer(),25);
         bf.makeBeer(new BeerProducer(),50,6.5f);
         Integer number = 1;
         int number1 = 1;
         System.out.println(number.getClass().isInstance(number1));
    }

    private void makeWhiskey(WhiskeyProducerInterface wpi, int liter) {
        wpi.addMalt(300);
        wpi.heatUrd(78);
        WhiskeyBarel wb = wpi.destillWhiskey(liter);
        System.out.println(wb);
    }

    private void makeBeer(BeerProducerInterface bpi, int liter, float percentage)
    {
        bpi.addMalt(1000);
        bpi.heatUrd(87);
        BeerBarel bb = bpi.brewBeer(liter,percentage);
        System.out.println(bb);
    }


}
