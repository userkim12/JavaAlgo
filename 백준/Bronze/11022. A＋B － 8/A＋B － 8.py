case = int(input())
SumList = []
ListA = []
ListB = []
for i in range(0, case):
    a, b = map(int, input().split())
    ListA.append(a)
    ListB.append(b)
    SumList.append(a+b)
for i in range(1, case+1):
    print("Case #%d: %d + %d = %d" % (i, ListA[i-1], ListB[i-1], SumList[i-1]))