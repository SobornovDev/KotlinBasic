package topics

fun main() {
    testWhen(15)
    testWhen("input")
    testWhen(1)
}

fun testWhen(input: Any) {

    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("in 10 to 20")
        is String -> println("String length: ${input.length}")
        else -> println("Smth else")
    }

}