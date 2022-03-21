package programmers.`수박수박수박수박수박수?`

class Solution {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 1 .. n) {
            answer += if (i % 2 == 0) {
                "박"
            } else {
                "수"
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()

    println(solution.solution(3))
    println(solution.solution(4))
}