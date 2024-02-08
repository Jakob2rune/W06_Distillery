import Model.BeerBarel;
import Model.WhiskeyBarel;

public class BeverageFactory {

     public static void main(String[] args) {
         BeverageFactory bf = new BeverageFactory();
         bf.makeWhiskey(new WhiskeyProducer(),25);
         bf.makeBeer(new BeerProducer(),50,6.5f);
    }

    private void makeWhiskey(BeverageProducer bp, int liter) {
        bp.addMalt(300);
        bp.heatUrd(95);
        WhiskeyBarel wb = bp.destillWhiskey(liter);
        System.out.println(wb);
    }

    private void makeBeer(BeverageProducer bp, int liter, float percentage)
    {
        bp.addMalt(1000);
        bp.heatUrd(87);
        BeerBarel bb = bp.brewBeer(liter,percentage);
        System.out.println(bb);
    }


}
