L = int(input())
N = int(input())

max = 0
max2 = 0
win = 0
win2 = 0
cake= [i for i in range(1,L+1)]
people = {}

for i in range(1,N+1):
    P,K = map(int,input().split(" "))
    tmp = []
    if K-P > max:
        max = K-P
        win = i
    for j in range(P,K+1):
        if j in cake:
            tmp.append(j)
            cake.remove(j)
    if tmp:
        people[i] = tmp
print(win)
for idx, val in people.items():
    if len(val) > max2:
        max2 = len(val)
        win2 = idx

print(win2)
