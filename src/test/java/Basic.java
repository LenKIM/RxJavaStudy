import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Basic {
    @Test
    public void testHelloWorld() {
        String result = "";
        Flowable.just("Hello world").subscribe(System.out::println);
        assertEquals("Hello world",result);
    }
}