package programmers.spacedNumbers

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf().toMutableList()
        for(i in 1 .. n) {
            answer.add(i.toLong() * x)
        }
        return answer.toLongArray()
    }
}

fun main() {
    val mySolution = Solution()
    var myLongArray = mySolution.solution(2, 5)
    print(myLongArray.contentToString())
}