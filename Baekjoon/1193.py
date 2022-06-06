n = int(input())
temp =0
num = 0
while temp < n:
    num +=1
    
    temp = (num**2 +num)//2
cnt = temp-n
if num%2 == 0:
    print(f'{num-cnt}/{1+cnt}')
else:
    print(f"{1+cnt}/{num-cnt}")
