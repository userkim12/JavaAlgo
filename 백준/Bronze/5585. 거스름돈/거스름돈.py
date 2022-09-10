a = 1000-int(input())
coins = [500,100,50,10,5,1]
answer=0
for i in coins:
  answer += a // i
  a = a % i
print(answer)