import sys

n = int(sys.stdin.readline())

num =0
result = 0
while result <n:
    num +=1
    result = 3*(num**2) -(3*num) +1
print(num)
