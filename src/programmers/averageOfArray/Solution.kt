package programmers.averageOfArray

import javax.xml.stream.events.Characters

class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        for (i in arr) {
            answer += i
        }
        answer /= arr.size
        return answer
    }
}

fun main() {
    val solution: Solution = Solution()
    println(solution.solution(intArrayOf(1, 2, 3, 4)))
    println(solution.solution(intArrayOf(5, 5)))
}