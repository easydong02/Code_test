T = int(input())

for testcase in range(1,T+1):
    a,b = map(int, input().split())
    A = list(map(int,input().split()))
    B = list(map(int, input().split()))

    max =0
    if a> b:
        trial = a-b+1
        for i in range(trial):
            sum =0
            for j in range(len(B)):
                sum += B[j]*A[j+i]
            if sum >=max:
                max = sum
                sum =0

    else:
        trial = b-a+1
        for i in range(trial):
            sum =0
            for j in range(len(A)):
                sum += A[j]*B[j+i]
            if sum >=max:
                max = sum
                sum =0
    print(f"#{testcase} {max}")
