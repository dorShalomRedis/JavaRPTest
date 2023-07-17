
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class MyTest {

    private static final Logger LOGGER = LogManager.getLogger(MyTest.class);

    @Test
    public void testMySimpleTest() {
        LOGGER.info("Hello from my simple test");
        LOGGER.info("OMG RP Works!");
    }
}