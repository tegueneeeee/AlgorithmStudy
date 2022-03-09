package programmers.caesarCipher

class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for (i in s) {
            answer += if (i in 'A' .. 'Z' && i + n > 'Z') {
                'A' + (n + i.code) - 'Z'.code - 1
            } else if (i in 'a' .. 'z' && i + n > 'z') {
                'a' + (n + i.code) - 'z'.code - 1
            } else if (i == ' ') {
                i
            } else {
                i + n
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution("AB", 1))
    println(solution.solution("z", 1))
    println(solution.solution("a B z", 4))
}