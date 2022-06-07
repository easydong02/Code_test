import math
a,b,c =  map(int,input().split(" "))
allday = (a-b) # 낮 + 밤
day =a # 낮
night = b # 밤

# c는 무조건 allday*x + day*1 임 구하는 것은 x+1
if a>=c:
    print(1)

elif (c-a)> (a-b):
    print(math.ceil((c-a)/(a-b)) +1 )

else:
    print(2)
