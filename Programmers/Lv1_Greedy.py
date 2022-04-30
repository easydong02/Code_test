def solution(n, lost, reserve):
    answer=0
    stu= [0 for i in range(n)]
    for i in lost:stu[i-1] = stu[i-1]-1
    for i in reserve:stu[i-1] = stu[i-1] +1
    for i in range(len(stu)):
        if (stu[i] ==-1) and (stu[i-1]==1) and (i !=0):
            stu[i]=stu[i]+1
            stu[i-1] = stu[i-1] -1
        elif i != len(stu)-1:
            if (stu[i] ==-1) and (stu[i+1]==1):
                stu[i]=stu[i]+1
                stu[i+1] = stu[i+1] -1

    for i in stu:
        if i>=0:
            answer=answer+1
    return answer
