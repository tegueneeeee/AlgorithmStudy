package programmers.`부족한 금액 계산하기`

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var needMoney = 0.0
        for (i in 1 .. count) {
            needMoney += price * i
        }
        if (needMoney >= money) {
            answer = (needMoney - money).toLong()
        } else {
            answer = 0
        }
        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(3, 20, 4))
}