# set과 list사용한 풀이
from itertools import permutations

# 소수 인지 확인하는 함수 
def find(num):
    if num ==1:
        return False
    for i in range(2,num):
        if (num %i == 0):
            return False
    return True

def solution(numbers):
    result = set()
    answer = 0
    for i in range(1,len(numbers)+1):
        result  |= set(   map(int,map("".join ,permutations(list(numbers),i)))  )
        
    result -= set([0,1])
    for i in result:
        if find(i):
            answer +=1

    return answer
