a = int(input())
money = [int(input()) for _ in range(a)]
coin = [25, 10, 5, 1]
answer = []
count = [0] *len(coin)
for i in money:
  for j in range(len(coin)):
    count[j] = i // coin[j]
    i = i % coin[j]
  answer.append(count.copy())

for i in answer:
  for j in range(4):
    print(i[j], end=' ')
  print()
