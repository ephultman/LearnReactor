package learnreactor.a;

public class RepeatingSimplePublisher extends SimplePublisher {

    public RepeatingSimplePublisher(String ... arr) {
        super(arr);
        stringFlux = stringFlux.repeat();
    }

}
