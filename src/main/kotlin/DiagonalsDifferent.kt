class DiagonalsDifferent {
    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var primarySum = 0
        var secondarySum = 0
        val length = arr.size
        for(i in 0 until length){
            primarySum += arr[i][i]
            secondarySum += arr[i][length-i-1]
        }
        return Math.abs(primarySum - secondarySum)
    }
}