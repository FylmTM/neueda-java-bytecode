package lv.neueda.bytecode.playground;

/**
 * Почему вызов super или другого конструктора этого-же класса должны быть первыми вызовами в конструкторе.
 * Это обосновано байт-кодом, можешь показать как оно компилится и объяснить зачем так надо.
 */
public class Duck2SuperThisFirst {

    public Duck createDuck() {
        // call constructer, with another constructor there
        Duck duck = new Duck("Anastasia", 999);
        return duck;
    }
}
