case = int(input())
SumList = []
for i in range(0, case):
    a, b = map(int, input().split())
    SumList.append(a+b)
for i in range(1, case+1):
    print("Case #%d: %d" % (i, SumList[i-1]))