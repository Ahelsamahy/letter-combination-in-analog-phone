import com.company.Main;
import org.junit.jupiter.api.Test;                              // using test

import static org.junit.jupiter.api.Assertions.assertThrows;    //for exception test

import Exception.outOfScope;                                    // call the exception class to check it here

import java.util.Arrays;                                        //when checking with the output
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class PhoneNumTest {

    @Test
    public void input1Number() throws outOfScope {
        List<String> result = Main.letterCombinations("2");
        assertEquals(Arrays.asList("a", "b", "c"), result);
    }

    @Test
    public void input2Numbers() throws outOfScope {
        List<String> result = Main.letterCombinations("23");
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }

    @Test
    public void input3Numbers() throws outOfScope {
        List<String> result = Main.letterCombinations("354");
        assertEquals(Arrays.asList("djg", "djh", "dji", "dkg", "dkh", "dki", "dlg", "dlh", "dli", "ejg", "ejh", "eji", "ekg", "ekh"
                , "eki", "elg", "elh", "eli", "fjg", "fjh", "fji", "fkg", "fkh", "fki", "flg", "flh", "fli"), result);
    }

    @Test
    public void input4Numbers() throws outOfScope {
        List<String> result = Main.letterCombinations("9276");
        assertEquals(Arrays.asList("wapm", "wapn", "wapo", "waqm", "waqn", "waqo", "warm", "warn", "waro", "wasm", "wasn", "waso", "wbpm", "wbpn", "wbpo", "wbqm", "wbqn", "wbqo", "wbrm", "wbrn", "wbro", "wbsm", "wbsn", "wbso", "wcpm", "wcpn", "wcpo", "wcqm", "wcqn", "wcqo", "wcrm", "wcrn", "wcro", "wcsm", "wcsn", "wcso",
                "xapm", "xapn", "xapo", "xaqm", "xaqn", "xaqo", "xarm", "xarn", "xaro", "xasm", "xasn", "xaso", "xbpm", "xbpn", "xbpo", "xbqm", "xbqn", "xbqo", "xbrm", "xbrn", "xbro", "xbsm", "xbsn", "xbso", "xcpm", "xcpn", "xcpo", "xcqm", "xcqn", "xcqo", "xcrm", "xcrn", "xcro", "xcsm", "xcsn", "xcso",
                "yapm", "yapn", "yapo", "yaqm", "yaqn", "yaqo", "yarm", "yarn", "yaro", "yasm", "yasn", "yaso", "ybpm", "ybpn", "ybpo", "ybqm", "ybqn", "ybqo", "ybrm", "ybrn", "ybro", "ybsm", "ybsn", "ybso", "ycpm", "ycpn", "ycpo", "ycqm", "ycqn", "ycqo", "ycrm", "ycrn", "ycro", "ycsm", "ycsn", "ycso",
                "zapm", "zapn", "zapo", "zaqm", "zaqn", "zaqo", "zarm", "zarn", "zaro", "zasm", "zasn", "zaso", "zbpm", "zbpn", "zbpo", "zbqm", "zbqn", "zbqo", "zbrm", "zbrn", "zbro", "zbsm", "zbsn", "zbso", "zcpm", "zcpn", "zcpo", "zcqm", "zcqn", "zcqo", "zcrm", "zcrn", "zcro", "zcsm", "zcsn", "zcso"), result);
    }

    @Test
    public void removeThe1s() throws outOfScope {

        List<String> result = Main.letterCombinations("511");
        assertEquals(Arrays.asList("j", "k", "l"), result);
    }

    @Test
    public void containsAlphabet() throws outOfScope {

        List<String> result = Main.letterCombinations("3a");
        assertEquals(Arrays.asList("d", "e", "f"), result);
    }

    @Test //more than one alphabet
    public void containsAlphabets() throws outOfScope {

        List<String> result = Main.letterCombinations("a3a");
        assertEquals(Arrays.asList("d", "e", "f"), result);
    }

    @Test
    public void containsSpecialCase() throws outOfScope {

        List<String> result = Main.letterCombinations("93$");
        assertEquals(Arrays.asList("wd", "we", "wf", "xd", "xe", "xf", "yd", "ye", "yf", "zd", "ze", "zf"), result);
    }

    @Test //more than one special case
    public void containsSpecialCases() throws outOfScope {

        List<String> result = Main.letterCombinations("@93$");
        assertEquals(Arrays.asList("wd", "we", "wf", "xd", "xe", "xf", "yd", "ye", "yf", "zd", "ze", "zf"), result);
    }

    @Test
    public void startsWithSpecialCase() throws outOfScope {

        List<String> result = Main.letterCombinations("$28");
        assertEquals(Arrays.asList("at", "au", "av", "bt", "bu", "bv", "ct", "cu", "cv"), result);
    }

    @Test
    public void startsWithCapitalAlphabet() throws outOfScope {

        List<String> result = Main.letterCombinations("A36");
        assertEquals(Arrays.asList("dm", "dn", "do", "em", "en", "eo", "fm", "fn", "fo"), result);
    }

    @Test
    public void containsAlphabetWithSpecialCase() throws outOfScope {
        List<String> result = Main.letterCombinations("6a$");
        assertEquals(Arrays.asList("m", "n", "o"), result);
    }



    @Test
    public void containsSpecialCaseOnly() {
        Throwable exception = assertThrows(outOfScope.class, () -> {
            Main.letterCombinations("$%^&");
        });
    }

    @Test
    public void containsAlphabetOnly() {
        Throwable exception = assertThrows(outOfScope.class, () -> {
            Main.letterCombinations("aaa");
        });
    }

    @Test
    public void longInput() {
        Throwable exception = assertThrows(outOfScope.class, () -> {
            Main.letterCombinations("326666");
        });
    }

    @Test
    public void nullInput() {

        Throwable exception = assertThrows(outOfScope.class, () -> {
            Main.letterCombinations("");
        });
    }

}
