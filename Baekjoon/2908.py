a = input().split(" ")

num1,num2 = int(a[0][::-1]), int(a[1][::-1])

if num1>num2:
    print(num1)
else:
    print(num2)
