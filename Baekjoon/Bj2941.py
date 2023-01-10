croatic = ["c=",'c-','dz=','d-','lj','nj','s=','z=']
word = input()

for i in croatic:
    if i in word:
        word =word.replace(i,"1")



print(len(word))
