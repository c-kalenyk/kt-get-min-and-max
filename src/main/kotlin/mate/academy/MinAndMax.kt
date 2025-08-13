package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min :Int = inputArray[0]
    var max :Int = inputArray[0]
    for (i in 0 until inputArray.size - 1) {
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
