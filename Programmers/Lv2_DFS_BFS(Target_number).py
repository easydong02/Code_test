from itertools import combinations

def solution(numbers, target):
    answer = 0
    numbers_= [2*i for i in numbers]
    make = sum(numbers) - target
    for i in range(1,len(numbers_)+1):
        result =  [sum(e) for e in  list(combinations(numbers_,i))]
        for j in result:
            if j ==make:
                answer +=1


    return answer
