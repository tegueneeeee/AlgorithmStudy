package programmers.natualNumberToReverseList

class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf().toMutableList()

        for(i in n.toString().reversed()) {
            answer.add(Character.getNumericValue(i))
        }
        return answer.toIntArray()
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(12345).contentToString())
}