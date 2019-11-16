def QuickSort(arr):
    less = []
    equal = []
    greater = []

    if len(arr) > 1:
        pivot = arr[0]
        for i in arr:
            if i < pivot:
                less.append(i)
            if i == pivot:
                equal.append(i)
            if i > pivot:
                greater.append(i)
        return (QuickSort(less) + equal + QuickSort(greater))
    else:
        return arr

def BinarySearch (arr, l, r, x):

    if r >= l:

        mid = l + (r - l)//2

        if arr[mid] == x:
            return mid

        elif arr[mid] > x:
            return BinarySearch(arr, l, mid-1, x)
        else:
            return BinarySearch(arr, mid + 1, r, x)

    else:
        return -1

line = input().split()
n = int(line[0])
q = int(line[1])

medicines = []
toSearch = []

line2 = input().split()
for x in range(n):
    medicines.append(line2[x])

for y in range(q):
    aux = input()
    toSearch.append(aux)

Sorted = QuickSort(medicines)

for z in range(len(toSearch)):
    print(BinarySearch(Sorted, 0, len(Sorted)-1, toSearch[z].strip()))
