fun mySqrt(x: Int): Int {
    if (x == 0) return 0

    var multiplication = 1L
    var result = 1L
        while (multiplication <= x) {
            result++
            multiplication = result * result
        }
    
    return (result - 1).toInt()
}