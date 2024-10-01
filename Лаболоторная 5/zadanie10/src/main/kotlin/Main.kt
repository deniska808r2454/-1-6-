//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    val sum = sumOfDigits(number)
    println("Сумма цифр числа $number равна $sum")
}

fun sumOfDigits(number: Int): Int {
    var sum = 0
    var num = number
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}