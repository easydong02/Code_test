import sys
A=int(sys.stdin.readline())
a = sorted(list(map(int,(sys.stdin.readline()).split())))
M=a[-1]
result=0.0
for i in a:
    result = result +((i/M)*100)
print(result/A)
