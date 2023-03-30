class ExtraSubstring {

    private fun getMappedValue(ch: Char): Int {
        return when (ch) {
            'a', 'b' -> 1
            'c', 'd', 'e' -> 2
            'f', 'g', 'h' -> 3
            'i', 'j', 'k' -> 4
            'l', 'm', 'n' -> 5
            'o', 'p', 'q' -> 6
            'r', 's', 't' -> 7
            'u', 'v', 'w' -> 8
            'x', 'y', 'z' -> 9
            else -> 0
        }
    }

    fun findSum(str: String): Int {
        val chars = str.toCharArray()
        val length = chars.size
        var sum = 0
        for (len in 1..length) {
            for (i in 0..(length - len)) {
                val j = i + len - 1
                var tempSum = 0
                for (k in i..j) {
                    tempSum += getMappedValue(chars[k])
                }
                if (j > 0 && tempSum % j == 0) {
                    sum++
                }
            }
        }
        return sum
    }
}