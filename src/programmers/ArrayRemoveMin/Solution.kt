package programmers.ArrayRemoveMin

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf().toMutableList()
        var min = arr[0]
        for (i in arr.indices) {
            if (arr[i] < min) {
                min = arr[i]
            }
        }
        answer.remove(min)
        if (answer.size == 0) {
            answer.add(-1)
        }
        return answer.toIntArray()
    }
}

fun main() {
    val solution: Solution = Solution()
    println(solution.solution(intArrayOf(4, 3, 2, 1)).contentToString())
    println(solution.solution(intArrayOf(10)).contentToString())
}