libros=['HarryPotter 245', 'GodelEscherBach 777','Flatland 96', 'Mistborn 541','CleanCode 469']

def MergeSort(arr):
    if len(arr)>1:
        mid=len(arr)//2

        left=arr[:mid]
        right=arr[mid:]

        MergeSort(left)
        MergeSort(right)

        i=0
        j=0
        k=0

        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1

        while i < len(left):
            arr[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1

MergeSort(libros)