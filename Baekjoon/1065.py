def isHan(n):
    if n<10:
        return True
    n_ = str(n)
    a= int(n_[-1]) - int(n_[-2])
    for i in range(len(n_)-1):
        if a==int(n_[-(i+1)]) - int(n_[-(i+2)]):
            pass
        else:
            return False
    return True
  
  
  N = int(input())
cnt=0
for i in range(1,N+1):
    if isHan(i):
        cnt = cnt+1

print(cnt)
