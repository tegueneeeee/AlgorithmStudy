package programmers.addDigits

class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        for (i in n.toString()) {
            answer += Character.getNumericValue(i)
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(123))
    println(solution.solution(987))
}