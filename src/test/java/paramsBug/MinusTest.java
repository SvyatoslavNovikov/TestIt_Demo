package paramsBug;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.testit.annotations.DisplayName;
import ru.testit.annotations.ExternalId;
import ru.testit.annotations.WorkItemIds;

import static org.testng.Assert.assertEquals;

public class MinusTest {

    @DataProvider(name = "paramsProvider")
    public static Object[][] params() {
        return new Object[][]{
                {3, 2, 1},
                {4, 1, 3},
                {5, 3, 2}
        };
    }

    @Test(dataProvider = "paramsProvider")
    @DisplayName("{n} - {m} = {l}")
    @WorkItemIds("6392")
    @ExternalId("36C29A602AD4D938F800EE27286D04C0C8634CAD6351B4313E9F87D9E5D88C91")
    public void minusTest(int m, int n, int l) {
        assertEquals(m - n, l);
    }
}
