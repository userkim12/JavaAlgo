n = int(input())
seat = input()
seat=seat.replace('LL','L')
print(min(len(seat)+1, n))