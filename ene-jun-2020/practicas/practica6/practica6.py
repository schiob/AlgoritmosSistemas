#la entrada que suelo usar
n,q=input().split()
arr=[]
arr2=[]
for n in input().split(" "):
  r=(n)
  arr.append(r)
for i in range(int(q)):
    c=input()
    arr2.append(c)
    
#quick sort
def quickSort(arr,start,end):
    pivot = start
    point = end
    while pivot != point:
        if arr[point] < arr[pivot] and point > pivot:
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        elif arr[point] > arr[pivot] and point < pivot:
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        if pivot > point:
            point += 1
        else:
            point -= 1
    if pivot != start:
        quickSort(arr, start, pivot-1)
    if pivot != end:
        quickSort(arr, pivot+1, end)

quickSort(arr,0,len(arr)-1)

def BinarySearch (arr, isq, der, x): 

    if der >= isq: 

        mid = isq + (der - isq)//2

        if arr[mid] == x: 
            return mid 

        elif arr[mid] > x: 
            return BinarySearch(arr, isq, mid-1, x) 
        else: 
            return BinarySearch(arr, mid + 1, der, x) 

    else: 
        return -1
for i in range(len(arr2)):
    print(BinarySearch(arr, 0, len(arr)-1, arr2[i])) 