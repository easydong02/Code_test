N = int(input())

P = sorted(list(map(int, input().split(" "))))
result =0
for i in range(N):
    result += sum(P[:i+1])

    
    
print(result)
