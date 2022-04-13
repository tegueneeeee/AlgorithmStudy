package programmers.`나머지가 1이 되는 수 찾기`

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 1 .. n) {
            if (n % i == 1) {
                answer = i
                break
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(10))
    println(solution.solution(12))
}