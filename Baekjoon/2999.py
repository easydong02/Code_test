N = input()
R =0
C =0
result = []
for r in range(1,len(N)+1):
    if len(N)%r ==0:
        c = len(N)//r
        if r<=c:
            R = r
            C = c

for i in range(R):
    tmp = i
    for j in range(C):
        result.append(N[tmp])
        tmp += R

print( "".join(result))
