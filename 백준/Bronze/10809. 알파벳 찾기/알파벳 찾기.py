word = input()
word = list(word)
li = [i for i in range(ord('a'), ord('z')+1)]

for i in li:
  if chr(i) in word:
    print(word.index(chr(i)), end=' ')
  else:
    print(-1, end=' ')