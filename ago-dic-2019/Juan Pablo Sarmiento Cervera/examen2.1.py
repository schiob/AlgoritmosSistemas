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
	arr=[]
	n = input("Cuantos Libros hay y cual buscas? ").split()
	l= input("Cuales son los libros?  ").split()
	arr=sorted(arr)

	print(binarySearch(arr,0,len(arr)-1,l))