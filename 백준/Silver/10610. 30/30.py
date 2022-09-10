n = list(input())
n.sort(reverse=True)
if '0' not in n:
  print(-1)
else:
  nn = list(map(int, n))
  if sum(nn) % 3 == 0:
    print(''.join(n))
  else:
    print(-1)