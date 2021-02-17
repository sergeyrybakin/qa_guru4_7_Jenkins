import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("Positive test")
    void successHamcrestAndAllureTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Negative test")
    void negativeHamcrestAndAllureTest() {
        assertThat(true, is(false));
    }

}
