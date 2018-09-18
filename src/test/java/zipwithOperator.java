import common.Log;
import hu.akarnokd.rxjava2.math.MathFlowable;
import io.reactivex.Observable;
import org.junit.Test;

public class zipwithOperator {

    @Test
    public void testZip(){
        Observable<Integer> source = Observable.zip(
                Observable.just(100, 200, 300),
                Observable.just(100, 200, 300),
                Observable.just(100, 200, 300),
                (a, b, c) -> a + b + c)
                .zipWith(Observable.just(1000, 2000, 3000),
                        (abc, d) -> abc + d)
                .zipWith(Observable.just(1000, 2000, 3000),
                        (abc, d) -> abc + d);

        source.subscribe(Log::it);
    }

    @Test
    public void testAmb(){
        Observable<Integer> source = MathFlowable()

        source.subscribe(Log::it);
    }
}
