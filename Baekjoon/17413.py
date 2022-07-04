S = input()
tag_check = False
word = ""
tag = ""
sentence= []
for i in S:
    
    if i == "<":
        tag_check = True
        if word:
            if word.startswith(" "):
                sentence.append(" "+word[:0:-1])
                word=""
            else:
                sentence.append(word[::-1])
                word=""               
        
    if i ==">":
        tag_check =False
        tag +=i
        sentence.append(tag)
        tag= ""
    
    if (i==' ') and not tag_check:
        if word.startswith(" "):
            sentence.append(" "+ word[:0:-1])
            word=""
        else:
            sentence.append(word[::-1])
            word=""    

    if tag_check:
        tag += i
    if (not tag_check) and (i !='>'):
        word += i

if word:
    if word.startswith(" "):
        sentence.append(" "+word[:0:-1])
        word=""
    else:
        sentence.append(word[::-1])
        word=""    

# print(f"word = {word}")
# print(f"tag = {tag}")
# print(f"sentence = {sentence}")

print("".join(sentence))
