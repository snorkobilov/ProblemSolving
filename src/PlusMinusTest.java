import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PlusMinusTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldPrintFractionsCorrect() {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        PlusMinus.plusMinus(arr);
        assertEquals("0.500000\n0.333333\n0.166667", outContent.toString());
    }
}
