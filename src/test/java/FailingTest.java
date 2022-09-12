import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FailingTest {

    @Test
    void testThatSucceeds() {
    }

    @Test
    void testThatFails() {
        fail();
    }
}
