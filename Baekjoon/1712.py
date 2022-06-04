temp = list(map(int,input().split(" ")))

if temp[1]<temp[2]:
    print(((temp[0])//(temp[2]-temp[1])) +1)
else:
    print(-1)
