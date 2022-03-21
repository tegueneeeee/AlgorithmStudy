package programmers.`서울에서 김서방 찾기`

class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        for (i in seoul.indices) {
            if (seoul[i] == "Kim") {
                answer = "김서방은 $i"+"에 있다"
            }
        }
        return answer
    }
}

fun main () {
    val solution = Solution()
    println(solution.solution(arrayOf("Jane", "Kim")))
}