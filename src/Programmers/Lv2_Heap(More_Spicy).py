import heapq
# heapq 사용
def solution(scoville, K):
    answer = 0
    result = []
    for i in scoville:
        heapq.heappush(result,i)

    while True:
        temp=heapq.heappop(result)
        if temp <K:
            if len(result) ==0:
                return -1
            heapq.heappush(result, temp+ (heapq.heappop(result)*2))
            answer +=1
        else:
            break
    
    return answer

#  PriorityQueue 사용 ->효율성 실패
# from queue import PriorityQueue


# def solution(scoville, K):
#     answer = 0
#     result = PriorityQueue()
#     for i in scoville:
#         result.put(i)
#     while True:
#         temp = result.get()
#         if temp < K:
#             result.put(temp+ (result.get()*2))
#             answer +=1
#         else:
#             break
    
#     return answer
