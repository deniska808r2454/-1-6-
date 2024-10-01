//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите количество чисел Фибоначчи:")
    val n = readLine()!!.toInt()
    println("Первые $n чисел Фибоначчи:")
    for (i in 0 until n) {
        print("${fibonacci(i)} ")
    }
    println()
}
fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}