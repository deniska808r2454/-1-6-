fun linearSearch(arr: IntArray, element: Int): Boolean {
    for (i in arr.indices) {
        if (arr[i] == element) {
            return true
        }
    }
    return false
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val elementToSearch = 3
    val isFound = linearSearch(arr, elementToSearch)
    println(isFound) //