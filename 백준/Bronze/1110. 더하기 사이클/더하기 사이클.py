n = int(input())
answer = n
count = 0

while True:
  a = n // 10
  b = n % 10
  c = (a+b)%10
  n = (b*10)+c
  
  count += 1
  if n == answer:
    break
print(count)