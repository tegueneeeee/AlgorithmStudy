package programmers.makeStrangeText

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var check = 0
        for (i in s.indices) {
            if (check % 2 == 0) {
                answer += s[i].toUpperCase()
            } else {
                answer += s[i].toLowerCase()
            }
            check++
            if (s[i] == ' ') {
                check = 0
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution("try hello world"))
}