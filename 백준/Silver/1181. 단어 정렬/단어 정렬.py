count = int(input())
answer = []
for i in range(count):
    answer.append(input())

answer = list(set(answer))
answer.sort(key=lambda x:(len(x),x))


for word in answer:
    print(word)