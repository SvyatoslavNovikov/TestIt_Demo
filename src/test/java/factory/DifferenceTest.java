package factory;

import org.testng.annotations.Test;
import ru.testit.annotations.Title;
import steps.StepExample;

public class DifferenceTest {

    Integer a;
    Integer b;

    public DifferenceTest(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Test
    @Title("Тест на вычитание")
    public void differenceTest() {
        StepExample.doDifference(a, b, a - b);
    }
}
