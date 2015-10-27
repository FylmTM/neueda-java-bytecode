package lv.neueda.bytecode;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class ExampleClassBenchmark {

    ExampleClass exampleClass;

    @Setup
    public void setUp() {
        exampleClass = new ExampleClass(0);
    }

    @TearDown
    public void tearDown() {
        assert exampleClass.getCounter() > 0;
    }

    @Benchmark
    public int testIncrement() {
        exampleClass.increment();
        return exampleClass.getCounter();
    }

}
