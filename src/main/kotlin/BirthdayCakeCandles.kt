class BirthdayCakeCandles {

    fun birthdayCakeCandles(candles: Array<Int>): Int {
        var maxCandle = 0
        for (candle in candles) {
            if (candle > maxCandle) {
                maxCandle = candle
            }
        }
        return candles.count { it == maxCandle }
    }
}