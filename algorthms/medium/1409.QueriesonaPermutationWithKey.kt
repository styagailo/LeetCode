fun processQueries(queries: IntArray, m: Int): IntArray {
    val P = mutableListOf<Int>()
    var j = 1
    
    while (j <= m) {
        P.add(j)
        j++
    }
    
    val result = IntArray(queries.size)
    var i = 0
    
    while (i < queries.size) {
        val value = queries[i]
        result[i] = P.indexOf(value)
        P.remove(value)
        P.add(0, value)
        i++
    }
    
    return result
}