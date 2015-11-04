package lv.neueda.bytecode.playground;

/**
 * С дженериками, показать, что всё компилируется в огромную кучу тайп кастов в байт коде и вот так оно и работает
 */
public class Duck4Generics {

    public void createDuck() {
        Duck lolly = new Duck("Lolly");
        DuckGeneric<Duck> genericLolly = new DuckGeneric<>(lolly);
        Duck stuff = genericLolly.getStuff();

        DuckSuperAwesome lollyAwesome = new DuckSuperAwesome("Lolly");
        DuckGeneric<DuckSuperAwesome> genericLollyAwesome = new DuckGeneric<>(lollyAwesome);
        DuckSuperAwesome genericStuff = genericLollyAwesome.getStuff();
    }
}
