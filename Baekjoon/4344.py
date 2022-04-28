import sys

N= int(sys.stdin.readline())

for i in range(N):
    cnt=0
    scores= list(map(float,sys.stdin.readline().split(" ")))
    avg = sum(scores[1:])/scores[0]
    
    for j in scores[1:]:
        if j>avg:
            cnt=cnt+1
    result = round(cnt/(len(scores)-1)*100,3)
    print("{:.3f}%".format(result))
