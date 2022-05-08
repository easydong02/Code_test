a = input().split(" ")
cnt=0
num=0
max=0
a_ = list(map(int,a))

for i in a_:
    tmp =0
    for j in a_:
        if i==j:
            tmp = tmp+1
        if j>=i:
            if j>=max:
                max=j
    if tmp >cnt:
        cnt = tmp
        num = int(i)



if cnt==3:
    print(10000+num*1000)
elif cnt ==2:
    print(1000+num*100)
else:
    print(max*100)
