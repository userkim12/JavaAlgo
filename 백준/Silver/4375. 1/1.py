while True:
  try:
    a=int(input())
    answer = '1'

    while True:
        if int(answer) % a == 0:
         print(len(answer))
         break
        else:
          answer += '1'

  except:
    break