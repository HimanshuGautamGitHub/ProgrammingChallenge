import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;


import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class TestFrequency {
    @Parameter(0)
    public String input;

    @Parameter(1)
    public String expectedCharacter;

    @Parameterized.Parameters(name = "{index}: First Non Repeated Char in {0}  is {1} ")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"1226#24#","11000000000000000000000101"},
                {"1(2)23(3)","21300000000000000000000000"}
        });
    }


    @Test
    public void test() throws Exception {
        Frequency frequency = new Frequency();
        assertEquals(expectedCharacter,frequency.frequency(input));
    }
}
