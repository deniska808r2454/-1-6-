//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите нижнюю границу диапазона:")
    val lowerBound = readLine()!!.toInt()
    println("Введите верхнюю границу диапазона:")
    val upperBound = readLine()!!.toInt()

    println("Простые числа в диапазоне от $lowerBound до $upperBound:")
    for (i in lowerBound..upperBound) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
    println()
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}