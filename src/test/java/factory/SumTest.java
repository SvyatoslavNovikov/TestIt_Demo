package factory;

import org.testng.annotations.Test;
import ru.testit.annotations.Title;
import steps.StepExample;

public class SumTest {
    Integer a;
    Integer b;

    public SumTest(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Test
    @Title("Тест на сложение")
    public void sumTest() {
        StepExample.doSum(a, b, a + b);
    }
}
