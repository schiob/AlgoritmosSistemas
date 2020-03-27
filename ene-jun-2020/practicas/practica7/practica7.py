def Shell(arr):
	salto = len(arr)//2 

	while salto > 0: 
	                 
		for i in range(salto,len(arr),1): 
			j = i-salto 

			while j >= 0: 

				k = j + salto

				if arr[j] <= arr[k]: 
					j =-1 
					pass

				elif arr[j] > arr[k]: 
					aux = arr[j]
					arr[j] = arr[k]
					arr[k] = aux
					j -= salto 
				pass 
			pass
		salto = salto//2 
		pass
	return arr


if _name_ == '_main_':
	print(" cantidad de colores: ")
	num = int(input())
	print("num. de colores: ")

	arr =input().split()
	print(" ")

	if num == len(arr):
		arr2 = []

		for i in range(num):
			arr2.append( int(arr[i]) )
			pass

		arr2 = Shell(arr2)

		index=0
		for name in arr2:
			print(arr2[index], end=" ")
			index += 1
		print(" ")
		pass