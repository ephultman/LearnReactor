package learnreactor.a;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.util.function.Consumer;

public class SimpleSubscriber implements Subscriber<String> {

    private BaseSubscriber<String> baseSubscriber;

    public SimpleSubscriber(Consumer<String> consumer) {
        baseSubscriber = new BaseSubscriber<String>() {
            @Override
            protected void hookOnNext(String value) {
                consumer.accept(value);
            }
        };

    }

    @Override
    public void onSubscribe(Subscription s) {
        baseSubscriber.onSubscribe(s);
    }

    @Override
    public void onNext(String s) {
        baseSubscriber.onNext(s);
    }

    @Override
    public void onError(Throwable t) {
        baseSubscriber.onError(t);
    }

    @Override
    public void onComplete() {
        baseSubscriber.onComplete();
    }
}
