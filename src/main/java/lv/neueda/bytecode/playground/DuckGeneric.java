package lv.neueda.bytecode.playground;

public class DuckGeneric<T extends Duck> {

    private final T stuff;

    public DuckGeneric(T stuff) {
        this.stuff = stuff;
    }

    public T getStuff() {
        return stuff;
    }
}
