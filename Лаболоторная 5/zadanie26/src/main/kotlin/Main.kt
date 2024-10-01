//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()

    var f = 0
    var h = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            f += i
        } else {
            h += i
        }
    }

    println("Сумма четных чисел от 1 до $n: $f")
    println("Сумма нечетных чисел от 1 до $n: $h")
}