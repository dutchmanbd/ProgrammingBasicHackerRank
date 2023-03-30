import java.math.BigInteger

class MiniMaxSum {

    fun miniMaxSum(arr: Array<Int>): Unit {
        arr.sort()
        var sum: BigInteger = BigInteger.ZERO
        val length = arr.size
        val bigIntegers = arr.map { BigInteger(it.toString()) }
        for (index in 0 until length) {
            sum = sum.add(bigIntegers[index])
        }
        println("${sum.subtract(bigIntegers.last())} ${sum.subtract(bigIntegers.first())}")
    }
}