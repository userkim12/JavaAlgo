a = ['a','e','i','o','u']

while True:
  num = 0
  answer = input().lower()
  if answer == '#':
    break
  for i in answer:
    if i in a:
      num+=1
  print(num)