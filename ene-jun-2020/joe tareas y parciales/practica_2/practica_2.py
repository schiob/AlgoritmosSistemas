import random
if __name__ == '__main__':
	num =int(input("tamaño del arreglo: "))
	arr=[]
	for i in range(num):
		arr.append(random.randint(1, 100))
		pass
	print(arr)


	for i in range(1, len(arr)): 
		key = arr[i]
		j = i-1
		while j >=0 and key < arr[j]:
			arr[j+1] = arr[j]
			j -= 1
			arr[j+1] = key
	print(arr)