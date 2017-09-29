package learnreactor.a;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import reactor.core.publisher.Flux;

/*
    Decorator around a simple Flux<String> to demonstrate the Publisher interface
 */
public class SimplePublisher implements Publisher<String> {

    protected Flux<String> stringFlux;

    public SimplePublisher(String ... arr ) {
        stringFlux = Flux.fromArray(arr);
    }

    @Override
    public void subscribe(Subscriber<? super String> s) {
        stringFlux.subscribe(s);
    }
}
