fun main() {
    println("Введите число N:")
    val a = readLine()?.toIntOrNull() ?: 10
    println("Простые числа до $a:")
    for (i in 2..a) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
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