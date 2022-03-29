package programmers.`나누어 떨어지는 숫자 배열`

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf().toMutableList()
        arr.sort()
        for (i in arr) {
            if (i % divisor == 0) {
                answer.add(i)
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1)
        }
        return answer.toIntArray()
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(intArrayOf(5, 9, 7, 10), 5).joinToString())
    println(solution.solution(intArrayOf(2, 36, 1, 3), 1).joinToString())
    println(solution.solution(intArrayOf(3, 2, 6), 10).joinToString())
}