count = int(input())
answer = []
for i in range(count):
    answer.append(list(map(int, input().split())))
answer = sorted(answer, key=lambda x: (x[0], x[1]))


for word in answer:
    print(word[0],word[1])