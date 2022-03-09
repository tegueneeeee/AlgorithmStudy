package programmers.stringToInteger

class Solution {
    fun solution(s: String): Int {
        return s.toInt()
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution("1234"))
    println(solution.solution("-1234"))
}