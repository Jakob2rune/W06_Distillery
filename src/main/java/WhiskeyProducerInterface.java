import Model.Adds;
import Model.BeerBarel;
import Model.WhiskeyBarel;

public interface WhiskeyProducerInterface extends Adds {

    WhiskeyBarel destillWhiskey(int volumeInliters);
}
