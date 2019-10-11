n=(int(input("Cuantas peliculas son?: ")))
p=input("Dime las peliculas con sus horas y minutos: ").split()
def mergeSort(p): 
    if len(p) >1: 
        mid = len(p)//2 
        L = p[:mid]  
        R = p[mid:]   
        mergeSort(L) 
        mergeSort(R)
  
        i = j = k = 0
        while i < len(L) and j < len(R): 
            if int(L[i][1] < R[j][1]): 
                p[k] = L[i] 
                i+=1
            else: 
                p[k] = R[j] 
                j+=1
            k+=1
            while i < len(L):
            	p[k] = L[i]
            	i+=1
            	k+=1
            while j < len(R): 
            	p[k] = R[j]
            	j+=1
            	k+=1 
#def printList(p): 
for i in range(len(p)):
	print(p[0]," ") 
#print()
#print(p)
if __name__ == '__main__':
	print("Las peliculas Dadas son: ", end="\n")
	print(p)
	mergeSort(p)
	print("Las peliculas ordenadas son: ", end="\n")
	printList(p[0]) 