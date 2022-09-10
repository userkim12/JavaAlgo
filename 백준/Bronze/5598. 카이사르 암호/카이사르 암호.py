a = input()
li = []

for i in a:
  asc = ord(i)-3
  if asc < ord('A'):
    asc = asc+26
  li.append(chr(asc))
  
print(''.join(li))