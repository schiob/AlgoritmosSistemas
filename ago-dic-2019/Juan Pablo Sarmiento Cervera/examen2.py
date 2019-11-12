def mergeSort(arr): 
    if len(arr) >1: 
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        mergeSort(L)
        mergeSort(R) 
        i = j = k = 0
        while i < len(L) and j < len(R): 
            if L[i] < R[j]: 
                arr[k] = L[i] 
                i+=1
            else: 
                arr[k] = R[j] 
                j+=1
                k+=1
        while i < len(L): 
            arr[k] = L[i] 
            i+=1
            k+=1          
        while j < len(R): 
            arr[k] = R[j] 
            j+=1
            k+=1
def binarySearch(arr,inicio,fin,x):
	if inicio>fin:
		return -1
	middle=(inicio+fin)//2
	if arr[middle]==x:
		return middle
	if x < arr[middle]:
		return binarySearch(arr,inicio,middle-1,x)
	else:
		return binarySearch(arr,middle+1,fin,x)
if __name__ == '__main__':
	arr=[]	#mergeSort(arr)
	n = input("Dime cuantos libros hay y cual buscas: ").split()
for i in range(n[0])
	b = input("Cuales son los libros que hay en la repisa?  ").split()
	arr.append(b)
	print(binarySearch(arr,0,len(arr)-1,n[1]))
	mergeSort(arr)
	arr=sorted(b)