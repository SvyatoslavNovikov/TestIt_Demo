package steps;

import org.testng.Assert;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;
import java.util.Random;

public class StepExample {

    @Step
    @Title("Получено число")
    public static Integer getInteger() {
        return new Random().nextInt(10);
    }

    @Step
    @Title("Сумма {a} и {b} равна {c}")
    public static void doSum(Integer a, Integer b, Integer c) {
        Assert.assertEquals(a + b, c);
    }

    @Step
    @Title("Разница между {a} и {b} равна {c}")
    public static void doDifference(Integer a, Integer b, Integer c) {
        Assert.assertEquals(a - b, c);
    }

}
