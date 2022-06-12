import sys

T = int(sys.stdin.readline())


for i in range(T):
    H,W,N =  map(int,sys.stdin.readline().split(" "))
    room = str((N//H)+1)
    floor= str(N%H)
    if int(floor) == 0 :
        floor= str(H)
    if N==H :
        room= "1"
    elif N%H ==0:
        room = str(N//H)
    if int(room) <10:
        print(floor+"0"+room)
    else:
        print(floor+room)
