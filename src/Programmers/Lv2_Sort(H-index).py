from collections import Counter 

def cnt(citations,a):
    cnt = Counter(citations)
    result =0
    b= max(citations)
    while b>=a:
        result += cnt[b]
        b -=1
    return result

def solution(citations):
    max_ = max(citations)
    while max_ >=0:
        if cnt(citations,max_) >= max_:
            return max_
        max_ -=1
    return False
