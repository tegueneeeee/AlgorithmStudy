package programmers.phoneNumbetToStar

class Solution {
    fun solution(phone_number: String): String {
        return "*".repeat(phone_number.length - 4) + phone_number.substring(phone_number.length - 4)
    }
}

fun main() {
    val solution: Solution = Solution()
    print(solution.solution("00000000"))
}