fun main(args: Array<String>) {
    val fizzBuzz = FizzBuzz()
    (1..100).forEach {
        println(fizzBuzz.fizzBuzz(it))
    }
}