arr=['naproxeno','paracetamol','rimantadina','azitromicina','ibuprofeno']


for i in range(0, len(arr)): #contador objeto comparado
	n=i+1					 #contador cantidad de medicinas
	for j in range(0,len(arr)-1):	#contador objeto a comparar
		if arr[j] > arr[j+1]:
			temp=arr[j]
			arr[j]=arr[j+1]			#Si el objeto es mayor se intercambian el lugar
			arr[j+1]=temp
		i+=1
		j+=1

print(n)
print(arr)