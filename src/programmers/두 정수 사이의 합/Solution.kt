package programmers.`두 정수 사이의 합`

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if (a < b) {
            for (i in a .. b) {
                answer += i
            }
        } else {
            for (i in b .. a) {
                answer += i
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(3, 5))
    println(solution.solution(3, 3))
    println(solution.solution(5, 3))
}