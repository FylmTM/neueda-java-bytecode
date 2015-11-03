package lv.neueda.bytecode.playground;

/**
 * Инициализация инстанса и статическая инициализация в байткоде, порядок исполнения (что вызывается раньше — код обычного конструктора, или инициализация)
 */
public class Duck5Initializer {

    public void createDuck() {
        Duck anatoly = new Duck("Anatoly")
        {{
            setAwesomness(10);
        }};
    }
}
