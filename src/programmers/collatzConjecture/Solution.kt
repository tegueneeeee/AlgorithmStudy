package programmers.collatzConjecture

class Solution {
    fun solution(num: Int): Int {
        var answer = num.toLong()
        var cnt = 0
        while (answer != 1L) {
            if (answer % 2 == 0L) {
                answer /= 2
            } else {
                answer *= 3
                answer++
            }
            cnt++
            if (cnt == 500) {
                cnt = -1
                break
            }
        }
        return cnt
    }
}

fun main() {
    val solution: Solution = Solution()

    print(solution.solution(626331))
}