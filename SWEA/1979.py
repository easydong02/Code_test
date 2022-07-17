T = int(input())

def word(array,K):
    cnt =0
    result =0
    for i in range(len(array)-1):
        if array[i] ==1:
            cnt +=1

        else:
            if cnt == K:
                result +=1
            cnt=0

        if i == len(array)-2:
            if (cnt ==K) and (array[i+1] ==0):
                result +=1
                cnt=0

            elif (cnt==K-1) and (array[i+1] ==1):
                result +=1
                cnt=0

    return result


for testcase in range(1,T+1):
    N,K = map(int,input().split())
    array= []

    answer= 0
    for _ in range(N):
        temp = list(map(int,input().split()))
        array.append(temp)
    array_ = [[] for i in range(len(array))]

    for i in array:
        answer += word(i, K)

    for i in range(len(array)):
        for j in range(len(array)):
            array_[i].append(array[j][i])

    for i in array_:
        answer += word(i, K)


    print(f"#{testcase} {answer}")
