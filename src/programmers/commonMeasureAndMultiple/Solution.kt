package programmers.commonMeasureAndMultiple

class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(0, 0)

        answer[0] = gcd(n, m)
        answer[1] = m * n / answer[0]
        return answer
    }
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a
        else gcd(b, a % b)
    }
}

fun main () {
    val solution: Solution = Solution()
    println(solution.solution(3, 12).contentToString())
    println(solution.solution(2, 5).contentToString())
}