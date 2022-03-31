package programmers.`가운데 글자 가져오기`

class Solution {
    fun solution(s: String): String {
        var answer = if (s.length % 2 == 0) {
            s[s.length / 2 - 1].toString() + s[s.length / 2].toString()
        } else {
            s[s.length / 2].toString()
        }
        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution("abcde"))
    println(solution.solution("qwer"))
}