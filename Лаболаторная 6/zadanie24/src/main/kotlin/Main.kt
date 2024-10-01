fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val columns = matrix[0].size
    val transposedMatrix = Array(columns) { IntArray(rows) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    return transposedMatrix
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val transposedMatrix = transposeMatrix(matrix)
    for (i in 0 until transposedMatrix.size) {
        println(transposedMatrix[i].contentToString())
    }
}