package programmers.integerSqureRoot

import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        var anwser: Long = 0
        val num = sqrt(n.toDouble()).toLong()
        anwser = if (num * num == n) {
            (num + 1) * (num + 1)
        } else {
            - 1
        }
        return anwser
    }
}

fun main() {
    val solution: Solution = Solution()
    println(solution.solution(121))
    println(solution.solution(3))
}