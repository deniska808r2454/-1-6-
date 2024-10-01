//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()

    val sumOfSquares = sumOfSquares(n)
    println("Сумма квадратов чисел от 1 до $n равна $sumOfSquares")
}

fun sumOfSquares(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    return sum
}