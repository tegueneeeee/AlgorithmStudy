# [이상한 문자 만들기](https://programmers.co.kr/learn/courses/30/lessons/12930)
Level1

解決方法:Stringをfor文でindex % 2 = 0の時にtoUpperCaseない時はtoLowerCaseにして空白の時はindexを0に設定した


困ったこと:空白の時の処理が必要だった

※
i in s.indices
answer += s[i].toUpperCase()
answer += s[i].toLowerCase()