arr =["CANDESARTAN_HIDROCLOROTIAZIDA_ALTER","CARBAMAZEPINA_NORMON","MATRIF","ACICLOVIR_SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"] 
#funcion de insertion
for j in range(1,len(arr)):   
    actual=arr[j]
    i=j-1
    while i>=0 and arr[i]< actual:
        arr[i+1]=arr[i]
        i -=1
    arr[i+1]=actual
     #salida de datos    
print(arr)