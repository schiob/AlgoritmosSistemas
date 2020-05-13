def binarySearch (arr, l, r, x):
    if r >= l:
        mid = l + (r - l) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binarySearch(arr, l, mid-1, x)
        else:
            return binarySearch(arr, mid + 1, r, x)
    else:
        return -1

def partition(arr,low,high):
    i = (low-1)
    pivot = arr[high]
  
    for j in range(low , high):
        if   arr[j] < pivot:
            i = i+1
            arr[i],arr[j] = arr[j],arr[i]
  
    arr[i+1],arr[high] = arr[high],arr[i+1]
    return (i+1)
    
def quickSort(arr,low,high):
    if low < high:
        pi = partition(arr,low,high)
        quickSort(arr, low, pi-1)
        quickSort(arr, pi+1, high)

n,q = list(map(int,input().split()))
arr = input().split()
quickSort(arr,0,n-1)
print(' '.join(arr))

for i in range(q):
	x = input()
	res = binarySearch(arr, 0, n-1, x)
	print(res)