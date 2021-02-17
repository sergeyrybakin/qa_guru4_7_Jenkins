import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(true, true);
    }

    @Test
    void negativeTest() {
        assertEquals(true, false);
    }
    @Test
    void successHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    void negativeHamcrestTest() {
        assertThat(true, is(false));
    }

}
