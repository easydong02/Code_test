def solution(answers):
    b= [2,1,2,3,2,4,2,5]
    c= [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    temp = [[ i%5+1 for i in range(len(answers))],[ b[i%8] for i in range(len(answers))],[ c[i%10] for i in range(len(answers))]]
    result=[]
    for i in temp:
        cnt=0
        for x,y in zip(i,answers):
            if x==y:
                cnt=cnt+1
        result.append(cnt)
    answer =[ i+1 for i in range(3) if result[i]==max(result)]
    return answer
