fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    val factorial = factorial(number)
    println("Факториал $number равен $factorial")
}

fun factorial(n: Int): Int {
    if (n < 0) {
        return -1 // Факториал отрицательного числа не определен
    } else if (n == 0) {
        return 1 // Факториал 0 равен 1
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }
}