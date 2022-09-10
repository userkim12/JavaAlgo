a = int(input())
b = []
for i in range(1,a+1):
  b.append(i)

ans = 1
for i in b:
  ans *= i

print(ans)