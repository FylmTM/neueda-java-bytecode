During this event we will learn the secrets of Java bytecode in the form of prepared kata. Some of the questions we want to answer:

- What code leads to what bytecode?
- How your methods are actually executed?
- What is the difference in allocation to the heap, stack, and registers?
- Should longs and doubles be volatile in concurrent code and why?
- How can you make your code faster?

Theme:

Object creation and manipulation. Typecasts. How can JVM work with generic type erasure?


### Proposed tools

- IntelliJ IDEA bytecode viewer plugin
- JMH for performance benchmarks
- JMH perfasm, if you are hardcore enough to explain assembly code
- jcstress for concurrent tests

### Materials

http://docs.oracle.com/javase/specs/jvms/se8/jvms8.pdf - official JVM spec

http://shipilev.net/ - a great source of information, which might be useful while preparing

Object creation:

- Как конкретно происходит инстанциирование (тут просто показать, что кладем на стек, вызываем invokesuper, собираем со стека штуку, вызываем new)
- Почему вызов super или другого конструктора этого-же класса должны быть первыми вызовами в конструкторе. Это обосновано байт-кодом, можешь показать как оно компилится и объяснить зачем так надо.
- Partially constructed objects или почему в конструкторе нужно сетать final поля. Тут можно сделать jcstress тест, чтобы показать, какие могут быть проблемы.
- С дженериками, показать, что всё компилируется в огромную кучу тайп кастов в байт коде и вот так оно и работает
- Инициализация инстанса и статическая инициализация в байткоде, порядок исполнения (что вызывается раньше — код обычного конструктора, или инициализация)

javap -v target.classes.lv.neueda.bytecode.playground.DuckPlay | less

https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings

http://arhipov.blogspot.se/2011/01/java-bytecode-fundamentals.html

http://zeroturnaround.com/rebellabs/java-bytecode-fundamentals-using-objects-and-calling-methods/

http://blog.jamesdbloom.com/JavaCodeToByteCode_PartOne.html

http://nitschinger.at/Debugging-Concurrency-Issues-with-Open-JDK-Jcstress
