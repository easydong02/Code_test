T = int(input())

def turn90(array):
    array_= []
    for j in range(len(array)):
        temp = []
        for i in range(len(array)-1,-1,-1):
            temp.append(array[i][j])

        array_.append(temp)
    return array_

def evaluate(list):
    list_ = sorted(list)
    a= [1,2,3,4,5,6,7,8,9]

    if list_ == a:
        return False

    return True


for testcase in range(1,T+1):
    chk = True
    array = []
    for i in range(9):
        array.append(list(map(int,input().split())))

    array_90 = turn90(array)

    for i in array:
        if evaluate(i) and chk:
            print(f"#{testcase} 0")
            chk = False
            break

    for i in array_90:
        if evaluate(i) and chk:
            print(f"#{testcase} 0")
            chk = False
            break

    for _ in [0,3,6]:
        for __ in [0,3,6]:
            temp = []
            for i in range(3):
                for j in range(3):
                    temp.append(array[i+_][j+__])

            if evaluate(temp) and chk:
                print(f"#{testcase} 0")
                chk = False
                break
    if chk:
        print(f"#{testcase} 1")
