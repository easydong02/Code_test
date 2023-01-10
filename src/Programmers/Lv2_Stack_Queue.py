temp=[]

def stop(a):
    global temp
    if len(a) ==0:
        return
    if a[0]>=100:
        temp.append(a.pop(0))
        stop(a)
    else:
        return 0
    return 0
  
def solution(progresses, speeds):
    global temp
    cnt=0
    answer = []
    while True:
        for i in range(1,len(progresses)+1):
            progresses[-i] = progresses[-i] + speeds[-i]
        
        if len(progresses) ==0:
            break
        temp.append(stop(progresses))

    for i in range(len(temp)):
        if temp[i]>=100:
            cnt +=1
            if temp[i+1] ==0:
                answer.append(cnt)
                cnt=0
    return answer
