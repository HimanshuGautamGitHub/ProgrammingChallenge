import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;


import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class FirstNonRepeatingCharacterTest {

    @Parameter(0)
    public String input;

    @Parameter(1)
    public char expectedCharacter;

    @Parameterized.Parameters(name = "{index}: First Non Repeated Char in {0}  is {1} ")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"AbcDafBCdE",'f'},
                { "Dellas", 'd' },
                { "Accessory", 'a' },
                { "ABCD", 'a' },
                {"AABBCCeDDfGG",'e'},
                { "GeeksForGeeks", 'f' },
                { "abaabcee", 'c' }



        });
    }


    @Test
    public void test() throws Exception {
        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
        assertEquals(expectedCharacter,firstNonRepeatingCharacter.findFirstNonRepeatingChar(input));
    }
}
