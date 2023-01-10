T = int(input())
 
for i in range(1,T+1):
    word = input()
 
    word_ = word[::-1]
 
    if word ==word_:
        print(f"#{i} 1")
    else:
        print(f"#{i} 0")
