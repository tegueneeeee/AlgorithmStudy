package `문자열 내림차순으로 배치하기`

import java.util.SortedSet

class Solution {
    fun solution(s: String): String {
        var answer = String(s.toCharArray().sortedArrayDescending())
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution("Zbcdefg"))
}