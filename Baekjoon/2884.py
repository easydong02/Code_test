h =[ i for i in range(24)]
m =[ i for i in range(60)]

a= input().split(" ")
H = h[int(a[0])]
M = m[int(a[1])]

if M>=45:
    print(f"{H} {M-45}")
else:
    print(f"{h[int(a[0])-1]} {60-(45-M)}")
