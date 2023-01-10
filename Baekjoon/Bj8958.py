import sys
A=int(sys.stdin.readline())
for i in range(A):
    cnt=[]
    b=0
    temp= list(sys.stdin.readline().strip())
    for j in range(len(temp)-1):
        if temp[j] == temp[j+1] == "O":
            b= b+1
            cnt.append(b)
        else:
            b=0
    print( sum(cnt) + temp.count("O"))
