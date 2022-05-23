# 모든 수를 직접 구했을 때
# from collections import Counter
# from itertools import combinations
# def multi(list_):
#     result =0
#     for i in list_:
#         temp=1
#         for j in i:
#             temp *=j
#         result +=temp
#     return result


# def solution(clothes):
#     answer = 0
#     parts= [i[1] for i in clothes]
#     parts_ = list(Counter(parts).values())
#     if len(parts_)>1:
#         for i in range(1,len(parts_)+1):
#             answer += multi(list(combinations(parts_,i)))
#     else:
#         answer = parts_[0]

#     return answer

# 공식
from collections import Counter


def solution(clothes):
    parts= [i[1] for i in clothes]
    parts_ = list(Counter(parts).values())
    temp=1
    for i in parts_:
        temp *= (i+1)

    return temp-1
