alpha = [0]*26
a = int(input())
li = [input() for x in range(a)]

for i in range(a):
  for j in range(len(li[i])):
    alpha[ord(li[i][j])-65] += 10 ** (len(li[i])-j-1)
alpha.sort(reverse=True)
answer = 0
n = 9
for i in alpha:
  if i == 0:
    break
  answer += i*n
  n -= 1
print(answer)