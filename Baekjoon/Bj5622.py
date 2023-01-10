dial = {2:[3,"ABC"], 3:[4,"DEF"], 4:[5,"GHI"], 5:[6,"JKL"], 6:[7,"MNO"], 7:[8,'PQRS'], 8:[9,'TUV'], 9:[10,'WXYZ']}
word = input().upper()
cnt = 0
for i in word:
    for alpha in dial.values():
        if i in alpha[1]:
            cnt += alpha[0]

print(cnt)
