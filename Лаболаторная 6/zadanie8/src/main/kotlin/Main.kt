fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val target = 3
    val index = numbers.indexOf(target)
    if (index != -1) {
        println("Индекс элемента $target: $index")
    } else {
        println("Элемент $target не найден")
    }
}

