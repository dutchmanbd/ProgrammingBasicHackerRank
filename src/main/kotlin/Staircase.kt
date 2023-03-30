class Staircase {
    fun staircase(n: Int): Unit {
        for (i in 0 until n) {
            val len = n-i-1
            for(j in 0 until len){
                print(" ")
            }
            for(j in len until n){
                print("#")
            }
            println()
        }
    }
}