package topics

class Variables {
    fun main() {
        val testVal: String = "First val"
        //testVal = "Change"   -  similar to final
        var testVar: String = "First var"
        testVar = "Change"

        println("Value of testVar: $testVar")
    }

}