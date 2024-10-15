fun main() {
    println("Конвертер валют")
    println("Введите сумму:")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    println("Введите исходную валюту (USD, EUR, RUB):")
    val b = readLine()?.uppercase() ?: ""
    println("Введите целевую валюту (USD, EUR, RUB):")
    val c = readLine()?.uppercase() ?: ""
    val d = 0.92
    val g = 74.0
    val h = 80.0
    val i= 1.08
    val j= 0.0135
    val k= 0.0125

    val convertedAmount = when (b to c) {
        "USD" to "EUR" -> a * d
        "USD" to "RUB" -> a * g
        "EUR" to "USD" -> a * i
        "EUR" to "RUB" -> a * h
        "RUB" to "USD" -> a * j
        "RUB" to "EUR" -> a * k
        else -> 0.0
    }
    if (convertedAmount != 0.0) {
        println("$a $b = ${BigDecimal(convertedAmount).setScale(2, RoundingMode.HALF_UP)} $c")
    } else {
        println("Некорректные данные. Проверьте введенные валюты.")
    }
}