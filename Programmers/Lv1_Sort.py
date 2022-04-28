def solution(array, commands):
    answer = []
    for i in commands:
        array_=[]
        a,b,c= i[0],i[1],i[2]
        if a != b :
            array_=sorted(array[a-1:b])
            answer.append(array_[c-1])
        else:
            answer.append(array[a-1])
    return answer
