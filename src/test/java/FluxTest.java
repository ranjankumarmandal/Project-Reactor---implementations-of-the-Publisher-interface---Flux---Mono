import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.Arrays;

public class FluxTest {

    // when you have separate datas, use Flux.just() to take data
    @Test
    void firstFlux() {
        Flux.just("Ranjan", "Kumar", "Mandal")
                .log()
                .subscribe(System.out::println);
    }

    // when you have data in a collection format like in ArrayList or something, use Flux.fromIterable() to take data
    @Test
    void fluxFromIterable() {
        Flux.fromIterable(Arrays.asList("Ranjan", "Kumar", "Mandal"))
                .log()
                .subscribe(System.out::println);
    }

    // when you want to take numbers in a given range, use Flux.range(start, count);
    @Test
    void fluxFromRange() {
        Flux.range(10, 5) // 10, 11, 12, 13, 14 (here start is 10 & count is 5)
                .log()
                .subscribe(System.out::println);
    }
}
