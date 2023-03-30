import kotlin.math.roundToInt

class PlusMinusRatio {

    fun Double.toPrecision(decimals: Int = 5): String {
        return "%.${decimals}f".format(this)
    }

    fun plusMinus(arr: Array<Int>): Unit {
        var positiveNumSum = 0.0
        var negativeNumSum = 0.0
        var zeroNumSum = 0.0
        val length = arr.size
        for (num in arr) {
            if (num > 0) {
                positiveNumSum++
            } else if (num < 0) {
                negativeNumSum++
            } else {
                zeroNumSum++
            }
        }
        println((positiveNumSum / length).toPrecision())
        println((negativeNumSum / length).toPrecision())
        println((zeroNumSum / length).toPrecision())
    }
}