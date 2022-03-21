package programmers.`문자열 다루기 기본`

class Solution {
    fun solution(s: String): Boolean {
        var answer = false
        try {
            s.toInt()
            answer = s.length == 4 || s.length == 6
        } catch (e :NumberFormatException) {
            answer = false
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution("a234"))
    println(solution.solution("1234"))
}