class Example {

    fun run(){
        fizzBuzz()

    }
    private fun fizzBuzz(){
        val max = readLine()?.toInt() ?: 0
        for (i in 1..max)
            when {
                (i % 3 == 0 && i % 5 ==0) -> println("FizzBuzz")
                (i % 3 == 0) -> println("Fizz")
                (i % 5 ==0) -> println("Buzz")
                else -> println("$i")
            }



    }
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            Example().run()

        }
    }
}