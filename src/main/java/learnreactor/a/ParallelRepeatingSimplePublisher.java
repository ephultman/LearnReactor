package learnreactor.a;

import reactor.core.scheduler.Schedulers;

public class ParallelRepeatingSimplePublisher extends RepeatingSimplePublisher {

    public ParallelRepeatingSimplePublisher(String ... arr) {
        super(arr);
        stringFlux = stringFlux.subscribeOn(Schedulers.parallel());
    }
}
