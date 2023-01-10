N = int(input())
ints = sorted(list(map(int, input().split())))

print(ints[(N+1)//2-1])
