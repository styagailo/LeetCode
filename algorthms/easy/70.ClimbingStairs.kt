fun climbStairs(n: Int): Int {
    val memo = IntArray(n + 1)
    return climbStairs(0, n, memo)
}

fun climbStairs(step: Int, n: Int, memo: IntArray): Int {
    if (step > n) return 0
    if (step == n) return 1

    if (memo[step] > 0) return memo[step]

    memo[step] = climbStairs(step + 1, n, memo) + climbStairs(step + 2, n, memo)
    return memo[step]
}