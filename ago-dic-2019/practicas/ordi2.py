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
	n=input().split()
	n[0]=int (n[0])
	for i in range (n[0]):
		m=input().split()
		arr.append(n[0])
		m[1]= int(m[1])
	print(binarySearch(arr,m[0],len(arr)-1,n[1]))