N, M, L = map(int, input().split(' '))

people = [0 if i>0 else 1 for i in range(N)]
ball =0
while True:
    if people[ball] ==M:
        break


    if people[ball] %2 !=0:
        ball = (ball+L)%len(people)
        people[ball] +=1

    else:
        ball = (ball -L)%len(people)
        people[ball] +=1

print(sum(people)-1)
