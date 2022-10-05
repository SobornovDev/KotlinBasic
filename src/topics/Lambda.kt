package topics

fun main() {
    //val numbers: List<Int> = listOf(1,2,3,4,5,6,7,8,9)
    doSomeNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
}

fun doSomeNumbers(vararg numbers: Int) {
    numbers.forEach { e -> println(e) }
    for (num in numbers) {
        println(num)
    }

    numbers.filter { e -> e > 5 }.forEach { e -> println(e) }

    for (num in numbers) {
        if (num > 5) {
            println(num)
        }
    }

    println(numbers.map { e -> e * 2 })
    println(numbers.filter { e -> e % 2 == 0 })
    println(numbers.reduce { sum, e -> e + sum })

    numbers.sortedByDescending { it }

    numbers.all { it < 10 }
    numbers.any { it < 10 }
    numbers.sum()

    val realNumber: List<Int> = listOf(1,2,3,4,0,-1,-2,-3,-4)
    val (positive, negative) = realNumber.partition { it > 0 }

    println(positive)
    println(negative)

    val groupWordByLength = listOf("one", "two", "four", "seven").groupBy { it.length }

    println(groupWordByLength)
    println(groupWordByLength.javaClass)

}