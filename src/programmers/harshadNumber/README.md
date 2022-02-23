# [하샤드 수](https://programmers.co.kr/learn/courses/30/lessons/12947)

Level1

解決方法:数を数の桁を足した数で分けたら０になるのかを確認した

困ったこと:数の桁を足すこととCharのInt化することのKotlin文が分からなかった

※　x.toString().chars().map(){
 Character.getNumericValue(it)
}.sum()
