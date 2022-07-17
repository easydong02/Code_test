T = int(input())

for t in range(1,T+1):
    print(f"#{t}")
    n = int(input())
    result = []
    later= 0
    temp =""
    later_chk= False
    for testcase in range(n):
        a, b_ = input().split()
        b = int(b_)

        for _ in range(later):
            result.append(temp)
            if len(result) ==10:
                print("".join(result))
                result =[]
            later_chk= True

        if later_chk:
            temp =""
            later =0
            later_chk =False

        if len(result) == 10:
            print("".join(result))
            result = []

        if len(result) < 10:
            if b + len(result) < 10:
                for _ in range(b):
                    result.append(a)
            else:
                temp = a
                later = b + len(result) -10
                for _ in range(10 - len(result)):
                    result.append(a)

        if len(result) == 10:
            print("".join(result))
            result = []

        if (testcase ==n-1) and(later >0):
            result = []
            for _ in range(later):
                if len(result) ==10:
                    print("".join(result))
                    result =[]
                result.append(a)
            if result:
                print("".join(result))
