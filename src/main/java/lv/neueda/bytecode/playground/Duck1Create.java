package lv.neueda.bytecode.playground;

/**
 * Как конкретно происходит инстанциирование
 * (тут просто показать, что кладем на стек, вызываем invokesuper, собираем со стека штуку, вызываем new)
 */
public class Duck1Create {

    // javap -v target.classes.lv.neueda.bytecode.playground.Duck1Create | less
    public Duck createDuck() {
        Duck duck = new Duck("Patrik");
        // create new object of type identified by class reference in constant pool index
        // duplicate the value on top of the stack
        return duck;
    }
}
