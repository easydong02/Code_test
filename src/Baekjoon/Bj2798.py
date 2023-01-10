from itertools import combinations
N, M = map(int,input().split(" "))

cards = list(map(int,input().split(" ")))



result = []

pool= list(combinations(cards, 3))

for i in pool:
    if sum(i) <= M:
        result.append(sum(i))

result = sorted(result)

print(result[-1])
