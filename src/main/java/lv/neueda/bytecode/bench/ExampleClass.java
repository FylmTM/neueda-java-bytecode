package lv.neueda.bytecode.bench;

public class ExampleClass {

    private int counter;

    public ExampleClass(int initial) {
        this.counter = initial;
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

}
