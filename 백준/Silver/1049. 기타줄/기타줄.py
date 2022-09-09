n, m = map(int, input().split())
price = []
answer = 0
for i in range(m):
  li = list(map(int, input().split()))
  price.append(li)
pack = sorted(price, key=lambda x: x[0])
one = sorted(price, key=lambda x: x[1])

if pack[0][0] <= one[0][1] * 6:
    answer = pack[0][0] * (n // 6) + one[0][1] * (n % 6)
    if pack[0][0] < one[0][1] * (n % 6):
        answer = pack[0][0] * (n//6 + 1)
else:
    answer = one[0][1] * n
print(answer)