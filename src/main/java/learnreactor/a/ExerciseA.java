package learnreactor.a;


import org.reactivestreams.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExerciseA {

    private static Logger logger = LoggerFactory.getLogger(ExerciseA.class);



    public static Subscriber<String> logSubscriber() {
        return new SimpleSubscriber(logger::info);
    }

    public static Subscriber<String> zeroLogSubscriber() {
        return new SimpleSubscriber(str -> {
            logger.info(str.replace('o', '0'));
        });
    }

}
