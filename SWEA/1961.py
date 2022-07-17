T = int(input())


def turn90(array):
    array_= []
    for j in range(len(array)):
        temp = []
        for i in range(len(array)-1,-1,-1):
            temp.append(str(array[i][j]))

        array_.append(temp)
    return array_

for testcase in range(1,T+1):
    N = int(input())
    array = []

    for i in range(N):
        array.append(list(map(int,input().split())))

    array_90 = turn90(array)
    array_180 = turn90(array_90)
    array_270 = turn90(array_180)

    print(f"#{testcase}")
    for i in range(len(array)):
        print(f"{''.join(array_90[i])} {''.join(array_180[i])} {''.join(array_270[i])}")
