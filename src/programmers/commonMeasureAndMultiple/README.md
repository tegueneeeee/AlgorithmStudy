# [최대공약수와 최소공배수](https://programmers.co.kr/learn/courses/30/lessons/12940)

Level1

解決方法: 
Euclidean AlgorithmでGCDは
GCG (A,B)＝（B,A%B)
if A%B = 0 -> GCD = B
else GCD(B, A%B)
であることでGCDを分かったらLCMは
A * B = GCD * LCMのため
LCM =　A * B / GCD

困ったこと:Euclidean Algorithmを覚えていると簡単に出来る問題だが急に問題で出ると難しいのでGDCを求める式は覚えて置いて方がいいと思った。

※　
private fun gcd(a: Int, b: Int): Int {
return if (b == 0) a
else gcd(b, a % b)
}