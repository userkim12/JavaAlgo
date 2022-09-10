coins = []
n, k = map(int, input().split())
for _ in range(n):
  coins.append(int(input()))
coins.sort(reverse=True)

needs = 0

for i in coins:
  if i <= k:
    needs += k // i
    k %= i
print(needs)