package programmers.integerReverse

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = n.toString().toMutableList().sortedDescending().joinToString("").toLong()
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(118372))
}