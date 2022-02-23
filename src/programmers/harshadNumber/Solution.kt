package programmers.harshadNumber

import javax.xml.stream.events.Characters

class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        answer = 0 == x % (x.toString().chars().map() {Character.getNumericValue(it)}.sum())
        return answer
    }
}

fun main() {
    val solution: Solution = Solution()
    var num: Int = readLine()!!.toInt()
    print(solution.solution(num))
}