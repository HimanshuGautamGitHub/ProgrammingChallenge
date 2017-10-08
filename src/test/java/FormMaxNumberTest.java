import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class FormMaxNumberTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final InputStream original = System.in;
    final static String path = "src/test/testFiles/FormMaxNumberTests/TestCase";

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(original);
    }

    @Parameter(0)
    public String testCaseName;


    @Parameterized.Parameters()
    public static Iterable<Object> data() {
        Object[] objectArray = new Object[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8"
        };
        return Arrays.asList(objectArray);
    }


    @Test
    public void test() throws Exception {
        String[] args = null;
        File targetFile = new File(path+testCaseName+".txt");
        FileInputStream fips =
                new FileInputStream(targetFile);
        String output = (String) FileUtils.readLines(targetFile).get(2);
        System.setIn(fips);
        FormMaxNumber.main(args);
        assertEquals(output,outContent.toString());
    }
}
