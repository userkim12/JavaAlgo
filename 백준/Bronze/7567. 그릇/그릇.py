a = list(input())
dish = [0] * len(a)
dish[0] = 10

for i in range(1, len(a)):
  if a[i-1] == '(':
    if a[i] == '(':
      dish.append(5)
    else:
      dish.append(10)
  else:
    if a[i] == '(':
      dish.append(10)
    else:
      dish.append(5)

print(sum(dish))