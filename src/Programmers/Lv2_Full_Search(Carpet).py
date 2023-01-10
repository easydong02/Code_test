def solution(brown, yellow):
    answer = []
    xy= brown + yellow
    x_plus_y = int((brown/2) +2)

    temp =3

    while True:
        x = x_plus_y -temp
        y = temp
        if (xy%y ==0) and ( xy==x*y):
            answer.append(x)
            answer.append(y)
            break
        temp +=1
    return answer
