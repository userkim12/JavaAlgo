a = int(input())
A = set(map(int, input().split(' ')))
b = int(input())
M  = list(map(int, input().split(' ')))

for i in M:
  if i in A:
    print(1)
  else:
    print(0)