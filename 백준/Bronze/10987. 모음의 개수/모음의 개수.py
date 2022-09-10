word = input()
m = 'aeiou'
count = 0
for i in word:
  if i in m:
    count += 1
print(count)