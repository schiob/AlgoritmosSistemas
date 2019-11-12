def BinarySearch (arr, l, r, x): 
    if r >= l: 
        mid = l + (r - l)//2
        if arr[mid] == x: 
            return mid+1

        elif arr[mid] > x: 
            return BinarySearch(arr, l, mid-1, x) 
        else: 
            return BinarySearch(arr, mid + 1, r, x) 
  
    else: 
        return -1


line = input().split()
n = int(line[0])
x = str(line[1]).lower()

books = []

line2 = input().split()
for y in range(n):
    books.append(line2[y].lower())

print(BinarySearch(books, 0, len(books)-1, x))