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

line = input().split()
n = int(line[0])
x = int(line[1])

tazos = []

line2 = input().split()
for y in range(n):
    tazos.append(int(line2[y]))

Sorted = QuickSort(tazos)


print(BinarySearch(Sorted, 0, len(Sorted)-1, x))