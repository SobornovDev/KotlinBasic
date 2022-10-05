package topics

fun main() {
    println(testSum(5, 7))
    println(classicFunction("str"))
    println(testNamedArgument(y = 5, x = 3, z = 9))
    println(testDefaultArgument())
    printEven(1,2,3,4,5,6,7,8,9)
    printEven(*intArrayOf(1,2,3,4,5,6,7,8,9))
}

fun testSum (x: Int, y: Int): Int = x + y

fun classicFunction (input: String): String {
    return "String is ${input}"
}

fun testNamedArgument (x: Int, y: Int, z: Int): List<Int> {
    return listOf(x,y,z)
}

fun testDefaultArgument(x: Int = 2, y: Int = 5): Int = x + y

//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e%2 == 0) println(e) }
}

