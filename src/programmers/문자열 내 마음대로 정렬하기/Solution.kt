package programmers.`문자열 내 마음대로 정렬하기`

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.also {
            it.sort()
            it.sortBy { it[n] }
        }
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(arrayOf("sun", "bed", "car"), 1))
    println(solution.solution(arrayOf("abce", "abcd", "cdx"), 2))
}