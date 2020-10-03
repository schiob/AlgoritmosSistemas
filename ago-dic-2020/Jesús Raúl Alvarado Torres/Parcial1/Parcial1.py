def MergeSort(arr):
    if len(arr) == 1:
        
        middle = len(arr)//2
        left_array = arr[:middle]
        right_array = arr[middle:]
        MergeSort(left_array)
        MergeSort(right_array)

        i=0
        j=0
        k=0

        while i<len(left_array) and j<len(right_array):
            if int(left_array[i][1])<=int(right_array[j][1]) and int(left_array[i][2])<=int(right_array[j][2]):
                arr[k]=left_array[i]
                i+=1

            else: 
                arr[k]=right_array[j]
                j+=1

            k+=1
        while i<len(left_array):
            arr[k]=left_array[i]
            i+=1
            k+=1

        while j<len(right_array):
            arr[k]=right_array[j]
            j+=1
            k+=1

num = int(input())
arr=[]

for i in range(num):
    x=input().split()
    arr.append(x)
MergeSort(arr)

for i in arr:
    print(''.join(i[0]), end=" ")