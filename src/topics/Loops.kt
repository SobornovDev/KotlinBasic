package topics


fun main() {
    //foreach
    val items = listOf("apple", "banana", "orange") //неизменяемый список

    for (item in items) {
        println(item)
    }

    var index = 0
    while (index < items.size) {
        println("Item at ${index} is ${items[index]}")
        index++
    }

    //диапазоны как в python
    println(5 in 3..10)
    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 0..100 step 10) {
        println(i)
    }

}
