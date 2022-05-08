h =[ i for i in range(24)]
m =[ i for i in range(60)]

a= input().split(" ")
b= int(input())
H = h[int(a[0])]
M = m[int(a[1])]

if b+M>=60:
    temp=(b+M)//60
    print(f"{h[(int(a[0])+temp)%24]} {m[(b+M-60)%60]}")
else:
    print(f"{H} {b+M}")
