f, l = map(int, input().split())
fruits = list(map(int, input().split()))

while True:
  if min(fruits) <= l:
    l += 1
    fruits.remove(min(fruits))
  if  not(fruits) or min(fruits) > l:
    break
print(l)