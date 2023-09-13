package paramsBug;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.testit.annotations.DisplayName;
import ru.testit.annotations.ExternalId;
import ru.testit.annotations.WorkItemIds;

import static org.testng.Assert.assertEquals;

public class SumTest {

    @DataProvider(name = "paramsProvider")
    public static Object[][] params() {
        return new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {3, 3, 6}
        };
    }

    @Test(dataProvider = "paramsProvider")
    @DisplayName("{n} + {m} = {l}")
    @WorkItemIds("6393")
    @ExternalId("1A153CD0A71286F45DD47D02FFFBC3F110A09EBFA54A8C922B6C9A01B3AC5E8A")
    public void sumTest(int n, int m, int l) {
        assertEquals(n + m, l);
    }
}
