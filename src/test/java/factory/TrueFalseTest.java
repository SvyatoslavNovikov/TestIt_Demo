package factory;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.testit.annotations.WorkItemIds;

public class TrueFalseTest {

    @DataProvider(name = "paramsProvider")
    public static Object[][] params() {
        return new Object[][]{
                {0, false},
                {1, true},
                {2, "null"}
        };
    }

    @Test(dataProvider = "paramsProvider")
    @Parameters({"bit", "boolean"})
    @WorkItemIds("10120")
    public void trueFalseTest(int input, Object output) {
        Assert.assertEquals(method(input), converter(output));
    }

    public Boolean method (int input) {
        if (input == 0) {
            return false;
        } else if (input == 1) {
            return true;
        } else {
            return null;
        }
    }

    public Object converter(Object input) {
        if (input.equals("null")) {
            return null;
        } else {
            return input;
        }
    }

}
