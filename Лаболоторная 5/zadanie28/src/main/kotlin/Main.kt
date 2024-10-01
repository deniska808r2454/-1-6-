//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //это 29 задание
    println("Введите число N:")
    val n = readLine()!!.toInt()

    var sum = 0.0

    for (i in 1..n) {
        sum += 1.0 / i
    }

    println("Сумма ряда 1, 1/2, 1/3, ..., 1/$n: $sum")
}