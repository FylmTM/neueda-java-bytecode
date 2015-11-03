package lv.neueda.bytecode.playground;

/**
 * Partially constructed objects или почему в конструкторе нужно сетать final поля.
 * Тут можно сделать jcstress тест, чтобы показать, какие могут быть проблемы.
 */
public class Duck3PartiallyConstructedObjects {

    private Duck duck;

    // In particular, the JMM permits compilers to allocate memory for the new object
    // and to assign a reference to that memory to the field before initializing the new object.
    // In other words, the compiler can reorder the write to the instance field
    // and the write that initializes the object so that the former occurs first.
    // This can expose a race window during which other threads
    // can observe a partially initialized object instance.
    public Duck getDuck() {
        return duck;
    }

    // http://docs.oracle.com/javase/specs/jls/se8/html/jls-17.html#jls-17.5.2
    // If your constructor writes to non-final members, they don't have to be committed to memory right away
    public void createDuck() {
        duck = new Duck("Jenny", 999);
    }
}
