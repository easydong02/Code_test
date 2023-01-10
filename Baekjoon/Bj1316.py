N= int(input())
cnt= N
for i in range(N):
    word = input()
    num_existed =[]
    err_cnt=0
    for j in range(len(word)):
        if word.count(word[j]) >1:
            if word[j] not in num_existed :
                for k in range(word.count(word[j])-1):
                    if err_cnt !=1:
                        if word[j+k] ==word[j+k+1]:
                            num_existed.append(word[j])
                        else:
                            cnt -=1
                            err_cnt=1

print(cnt)
