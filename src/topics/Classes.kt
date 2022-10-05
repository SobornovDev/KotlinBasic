package topics

fun main() {
    val child = Person("Henry", "Debua", 1)
    val person = Person("Vladimir", "Mironov", 28, child)
}

//Primary Constructor
class Person(val name: String, val surname: String, var age: Int) {

    var children: MutableList<Person> = mutableListOf(); //ArrayList

    init {
        println("Person ${name} ${surname} is created")
    }

    //Вторичный конструктор
    constructor(name: String, surname: String, age: Int, child: Person): this(name, surname, age) {
        children.add(child)
    }

    //Default Constructor
    constructor(): this(name = "", surname = "", age = -1)

}

data class Rectangle(val height: Int, val length: Int) {
    val perimeter: Int = (height + length)*2

    var type: String = "normal"
        get() = "$field field"
        set(value) {
            if (field == "") println ("empty string")
            field = value
        }

    fun area() = height*length
}