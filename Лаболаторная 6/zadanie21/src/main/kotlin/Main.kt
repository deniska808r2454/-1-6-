fun main() {
fun removeElement(arr: IntArray, element: Int): IntArray {
    var count = 0
    for (i in arr.indices) {
        if (arr[i] != element) {
            arr[count] = arr[i]
            count++
        }
    }
    return arr.copyOf(count)
}