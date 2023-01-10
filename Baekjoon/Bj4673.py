def self_num(n):
    n_ = str(n)
    a= 0
    for i in range(len(n_)):
        a= a+ int(n_[i])
    return n+a
list1= [i for i in range(1,10001)]
for i in range(1,10001):
    if self_num(i) <=10000:
        if self_num(i) in list1:
            list1.remove(self_num(i))
for i in list1:
    print(i)
