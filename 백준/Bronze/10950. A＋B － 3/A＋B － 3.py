count = int(input())
SumList = []
for i in range(0, count):
    a, b = map(int, input().split())
    c = a+b
    SumList.append(c)
for i in SumList:
    print(i)