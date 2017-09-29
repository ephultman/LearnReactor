package learnreactor;

import learnreactor.a.ParallelRepeatingSimplePublisher;
import learnreactor.a.RepeatingSimplePublisher;
import learnreactor.a.SimplePublisher;

import org.junit.Test;


import static learnreactor.a.ExerciseA.logSubscriber;
import static learnreactor.a.ExerciseA.zeroLogSubscriber;


public class ExerciseATest {

    @Test
    public void testSimple() {
        SimplePublisher publisher = new SimplePublisher("Hello", "World");

        publisher.subscribe(logSubscriber());
        publisher.subscribe(zeroLogSubscriber());
    }

    @Test
    public void testRepeating() {
        RepeatingSimplePublisher repeater =
                new RepeatingSimplePublisher("Hello", "World");

        repeater.subscribe(logSubscriber());
        repeater.subscribe(zeroLogSubscriber());
    }

    @Test
    public void testParallelRepeating() {
        ParallelRepeatingSimplePublisher parallelRepeater =
                new ParallelRepeatingSimplePublisher("Hello", "World");

        parallelRepeater.subscribe(logSubscriber());
        parallelRepeater.subscribe(zeroLogSubscriber());
    }

    @Test
    public void testParallelWithSleep() throws InterruptedException {

        ParallelRepeatingSimplePublisher parallelRepeater =
                new ParallelRepeatingSimplePublisher("Hello", "World");

        parallelRepeater.subscribe(logSubscriber());
        parallelRepeater.subscribe(zeroLogSubscriber());

        Thread.sleep(1000);

    }

}
