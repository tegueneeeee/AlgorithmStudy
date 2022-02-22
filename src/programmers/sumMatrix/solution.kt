package programmers.sumMatrix

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        answer = Array<IntArray>(arr1.size) { i ->
        IntArray(arr1[0].size) { j -> arr1[i][j] + arr2[i][j] }
        }
        return answer
    }
}

fun main() {
    val solution = Solution()
    val arr1 = arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(2, 3))
    val arr2 = arrayOf<IntArray>(intArrayOf(3, 4), intArrayOf(5, 6))

    print(solution.solution(arr1, arr2).contentDeepToString())
}