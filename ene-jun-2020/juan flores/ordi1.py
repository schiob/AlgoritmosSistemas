def mergesort(arr, stat):
    if len(arr)>1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        mergesort(L, stat)
        mergesort(R, stat)
        i=j=k=0
        while i < len(L) and j < len(R):
            l = len(L[i]) if stat else int(L[i][0])
            r = len(R[j]) if stat else int(R[j][0])
            if l < r:
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
            
n = int(input())

cajas = []
for i in range(n):
	cajas.append(input().split())
	for j in range(len(cajas[i])):
		cajas[i][j] = cajas[i][j].split('-')
	mergesort(cajas[i],False)

mergesort(cajas, True)

def get_seg(cajas):
	seg = 0
	for i in cajas:
		for j in i:
			seg += int(j[0])
			if j[1] == 'B':
				return seg

print(get_seg(cajas))