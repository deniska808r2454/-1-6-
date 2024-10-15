fun pyramid(n: Int) {
    for (i in 1..n) {
        val a = n - i
        print(" ".repeat(a))
        print("#".repeat(i * 2 - 1))
        println(" ".repeat(a))
    }
}

fun main() {
    pyramid(1)
    println()
    pyramid(2)
    println()
    pyramid(3)
}