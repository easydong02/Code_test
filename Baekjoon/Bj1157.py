from collections import Counter

word = input()
cnt = Counter(word.upper())
keys = []
values = []
for key,value in cnt.items():
    keys.append(key)
    values.append(value)

if values.count(max(values))>1:
    print('?')
else:
    print(keys[values.index(max(values))])
