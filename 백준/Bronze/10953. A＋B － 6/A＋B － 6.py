case = int(input())
SumList = []
for i in range(0, case):
    a, b = map(int, input().split(','))
    SumList.append(a+b)
for i in SumList:
    print(i)