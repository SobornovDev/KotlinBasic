package topics

fun main() {
    var a: String = "Can't be null"
    println(a.length)

    var b: String? = "Can be null"
    if (b != null) {
        println(b.length)
    }

    //save call
    println(b?.length) // вернёт b, если b есть или null, если там null. Никаких NPE

    //Elvis operator
    val l = b?.length ?: -1
    //if b == null, l return -1

    // !! - throws NPE exception
    val g = b!!.length
}