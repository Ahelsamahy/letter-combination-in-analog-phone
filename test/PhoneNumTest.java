import com.company.Main;
import org.junit.jupiter.api.Test;                              // using test
import static org.junit.jupiter.api.Assertions.assertThrows;    //for exception test
import Exception.outOfScope;                                    // call the exception class to check it here
import java.util.Arrays;                                        //when checking with the output
import java.util.List;
import static org.testng.AssertJUnit.assertEquals;

public class PhoneNumTest {

    @Test public void test1Number() throws outOfScope {
        Main myUnit = new Main();

        List<String> result = myUnit.letterCombinations("2");
        List<String> expectedResult = Arrays.asList("a", "b", "c");
        assertEquals(expectedResult, result);
    }

    @Test public void test2Numbers() throws outOfScope {
        Main myUnit = new Main();

        List<String> result = myUnit.letterCombinations("23");
        List<String> expectedResult = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expectedResult, result);
    }

    @Test public void removeThe1s() throws outOfScope {
        Main myUnit = new Main();

        List<String> result = myUnit.letterCombinations("511");
        List<String> expectedResult = Arrays.asList("j", "k", "l");
        assertEquals(expectedResult, result);
    }


    //when exceeding the limit of numbers
    @Test public void longInput() {
        Main myUnit = new Main();
        Throwable exception = assertThrows(outOfScope.class, () -> {myUnit.letterCombinations("326666");});
    }

    //empty input
    @Test public void nullInput() {
        Main myUnit = new Main();
        Throwable exception = assertThrows(outOfScope.class, () -> {myUnit.letterCombinations("");});
    }

}
