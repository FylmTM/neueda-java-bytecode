package lv.neueda.bytecode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

import lv.neueda.bytecode.bench.ExampleClass;

public class ExampleClassTest {

    ExampleClass exampleClass;

    @BeforeMethod
    public void setUp() throws Exception {
        exampleClass = new ExampleClass(0);
    }

    @Test
    public void testIncrement() {
        exampleClass.increment();

        assertThat(exampleClass.getCounter()).isEqualTo(1);
    }

}
