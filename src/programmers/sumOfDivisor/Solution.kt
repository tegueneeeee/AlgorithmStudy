package programmers.sumOfDivisor

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1 .. n) {
            if (n % i == 0) {
                answer += i
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(12))
    println(solution.solution(5))
}