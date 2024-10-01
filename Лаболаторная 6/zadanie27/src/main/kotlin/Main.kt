fun main() {
    val numbers = intArrayOf(1, 1, 2, 2, 2, 3, 3, 3, 3, 4)
    var maxLength = 1
    var currentLength = 1
    var maxSequenceStart = 0
    var currentSequenceStart = 0
    for (i in 1 until numbers.size) {
        if (numbers[i] == numbers[i - 1]) {
            currentLength++
        } else {
            currentLength = 1
            currentSequenceStart = i
        }
        if (currentLength > maxLength) {
            maxLength = currentLength
            maxSequenceStart = currentSequenceStart
        }
    }
    println("Максимальная последовательность: ${numbers.sliceArray(IntRange(maxSequenceStart, maxSequenceStart + maxLength - 1))}")
}