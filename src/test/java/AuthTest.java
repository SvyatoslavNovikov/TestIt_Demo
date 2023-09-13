import org.testng.Assert;
import org.testng.annotations.Test;
import ru.testit.annotations.DisplayName;
import ru.testit.annotations.ExternalId;
import ru.testit.annotations.Title;
import ru.testit.annotations.WorkItemIds;

public class AuthTest {

    @Test
    @ExternalId("testItDemo1Test")
    @DisplayName("Test It demo test 01")
    @Title("Test It demo test 01")
    public void testItDemo1Test() {
        Assert.assertTrue(true);
    }

    @Test
    @ExternalId("testItDemo2Test")
    @DisplayName("Test It demo test 02")
    @Title("Test It demo test 02")
    public void testItDemo2Test() {
        Assert.assertTrue(false);
    }

}
