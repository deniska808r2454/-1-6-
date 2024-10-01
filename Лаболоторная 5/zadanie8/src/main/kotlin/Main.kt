//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()
    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    val gcd = gcd(num1, num2)
    println("НОД $num1 и $num2 равен $gcd")
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return gcd(b, a % b)
    }
}