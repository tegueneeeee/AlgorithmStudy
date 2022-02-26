# [콜라츠 추측](https://programmers.co.kr/learn/courses/30/lessons/12943)

Level1

解決方法:１になるまで式を繰り返すためにwhile文を１がなるまでしてwhile文が何回実行されたのかをcntに入れる。

困ったこと:cntが500になると−1にする式が動かなったけどoverflowがあったためintをlongに刑変化すると解決した。


※　num.toLong()