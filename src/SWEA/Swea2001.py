T = int(input())


for testcase in range(1,T+1):
    N, M = map(int, input().split())
    array = []
    max = 0
    for i in range(N):
        array.append(list(map(int, input().split())))

    for i in range(N-M+1):
        for j in range(N-M+1):
            sum = 0
            for h in range(M):
                for k in range(M):
                    sum += array[i+h][j+k]

            if sum >=max:
                max =sum
    print(f"#{testcase} {max}")
