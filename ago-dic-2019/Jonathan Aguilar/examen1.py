def Mergesort(arr):
	if len(arr)>1:
		#divido
		middle=len(arr)//2
		left= arr[:middle]
		right=arr[middle:]
		
		#resuelvo
		new_left=Mergesort(left)
		new_right=Mergesort(right)
		
		#junto la solucion
		new_arr=Merge(new_left, new_right)
		return new_arr

	return arr

def Merge(left,right):
	arr=[0]*(len(left)+len(right))

	arr_app=0
	l_app=0
	r_app=0

	while l_app<len(left) and r_app<len(right):
		if left[l_app]<right[r_app]:
			arr[arr_app]=left[l_app]
			arr_app += 1
			l_app+=1

		else:
			arr[arr_app]=right[r_app]
			arr_app+=1
			r_app+=1

	while l_app<len(left):
		arr[arr_app]=left[l_app]
		arr_app += 1
		l_app+=1

	while r_app<len(right):
		arr[arr_app]=right[r_app]
		arr_app+=1
		r_app+=1

	return arr


if __name__ == '__main__':
	arr=[]
	b=int(input("cuantas peliculas seran: "))
	for F in range (b):
		u=input("Dame el nombre: ")
		arr.append(u)	
	new_arr=Mergesort(arr)
	print(new_arr)
	