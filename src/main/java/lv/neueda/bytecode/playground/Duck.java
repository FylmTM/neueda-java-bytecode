package lv.neueda.bytecode.playground;

public class Duck {

    private final String name;
    private int awesomness = 0;

    public Duck(String name) {
        // set field to value in an object objectref,
        // where the field is identified by a field reference index in constant pool
        this.name = name;
        this.awesomness = 0;
    }

    public Duck(String name, int awesomness) {
        // reference created, not initialized
        this(name);
        // parent initialized, methods allowed
        this.awesomness = awesomness;
    }

    public void setAwesomness(int awesomness) {
        this.awesomness = awesomness;
    }
}
