package factory;

import org.testng.annotations.Factory;
import steps.StepExample;

public class FactoryTestCase {

    @Factory
    public Object[] factoryMethod() {
        Integer a = StepExample.getInteger();
        Integer b = StepExample.getInteger();

        return new Object[] {
                new SumTest(a, b),
                new DifferenceTest(a, b)
        };
    }

}
