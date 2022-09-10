a = int(input())
time = [300, 60, 10]
count = [0]*3

if a % 10 != 0:
  print(-1)
else:
  for i in range(3):
    count[i] =  a // time[i]
    a = a % time[i]

  print(count[0],count[1],count[2])