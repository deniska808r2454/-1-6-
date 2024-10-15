fun fizzBuzz(n: Int): List<Any> {
    val a = mutableListOf<Any>()
    for (i in 1..n) {
        when {
            i % 15 == 0 -> a.add("ВизллБизлл")
            i % 3 == 0 -> a.add("Физллл")
            i % 5 == 0 -> a.add("Бизлллл")
            else -> a.add(i)
        }
    }
    return a
}
fun main() {
    println(fizzBuzz(5))
    println(fizzBuzz(16))
}