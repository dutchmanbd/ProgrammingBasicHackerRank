import java.text.SimpleDateFormat

class TimeConversion {
    fun timeConversion(s: String): String {
        val lastIndex = s.length - 2
        val givenTimeStr = "${s.substring(0, lastIndex)} ${s.substring(lastIndex)}"
        val givenTimeFormatter = SimpleDateFormat("hh:mm:ss a")
        val outputTimeFormatter = SimpleDateFormat("HH:mm:ss")
        val givenTime = givenTimeFormatter.parse(givenTimeStr)
        return outputTimeFormatter.format(givenTime)
    }
}