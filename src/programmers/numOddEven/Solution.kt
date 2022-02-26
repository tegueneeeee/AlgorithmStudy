package programmers.numOddEven

class Solution {
    fun solution(num: Int): String {
        var answer = ""
        answer = if (num % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
        return answer
    }
}

fun main() {
    val solution: Solution = Solution()
    println(solution.solution(3))
    println(solution.solution(4))
}