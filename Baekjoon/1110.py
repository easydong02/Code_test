a = int(input())
if a<10:a= a*11
temp = a
cnt=0
while True:
    if a ==0:
        cnt = 1
        break
    a= str(a)
    head = a[1]
    tail = str(int(a[0])+int(a[1]))[-1]
    a = head+tail
    cnt= cnt+1
    temp2= int(a)
    if temp==temp2:break
print(cnt)
