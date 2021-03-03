import lombok.extern.slf4j.Slf4j;
import medium.比特位计数;
import org.springframework.util.StopWatch;

/**
 * @Author anyang
 * @CreateTime 2021/3/3
 * @Des
 */
@Slf4j
public class Test {
    @org.junit.jupiter.api.Test
    public void 比特位计数() {
        StopWatch sw = new StopWatch();
        sw.start();
        int[] ints = 比特位计数.countBits(10);
        sw.stop();
        log.info("耗时 毫秒{}， 纳秒 {}", sw.getTotalTimeMillis(), sw.getTotalTimeNanos());
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

}
