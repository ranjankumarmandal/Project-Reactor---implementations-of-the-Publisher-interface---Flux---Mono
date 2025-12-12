import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

public class Operators_ProjectReactor {

    @Test
    void map() {
        Flux.range(10, 5)
                .map(i -> i * 10) // it will each nums and multiply by 10
                .subscribe(System.out::println);
    }

    @Test
    void flatMap() {
        Flux.range(10, 5)
                .flatMap(i -> Flux.range(i * 10, 2))
                .subscribe(System.out::println);
    }

    @Test
    void flatMapMany() {
        Mono.just(3)
                .flatMapMany(i -> Flux.range(1, i))
                .subscribe(System.out::println);
    }


    // Below task is getting executed parallely in another single thread by event loop, so we don't need to care about thread creation and all, it will be optimized by event loop.
    @Test
    void concat() throws InterruptedException {
        Flux<Integer> oneToFive = Flux.range(1, 5);
//                .delayElements(Duration.ofMillis(200));
        Flux<Integer> sixToTen = Flux.range(6, 5);
//                .delayElements(Duration.ofMillis(400));

        Flux.concat(oneToFive, sixToTen)
                .subscribe(System.out::println);

        Thread.sleep(4000); // we need to use this because all above running on another single thread, not in main thread.
    }

    @Test
    void merge() throws InterruptedException {
        Flux<Integer> oneToFive = Flux.range(1, 5);
        Flux<Integer> sixToTen = Flux.range(6, 5);

        Flux.merge(oneToFive, sixToTen)
                .subscribe(System.out::println);

        Thread.sleep(4000);
    }
}
