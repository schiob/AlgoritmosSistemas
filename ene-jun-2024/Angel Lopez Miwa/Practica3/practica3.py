"""
Chuy está estudiando para ser doctor y batalla mucho con los nombres tan extraños que tienen las medicinas, 7
algunos de esos nombres pueden ser muy largos, como *CANDESARTAN HIDROCLOROTIAZIDA ALTER*, 
Chuy tiene una lista con nombres de medicamentos y quiere ordenarla de los nombres más cortos a los 
más largos para así estudiarla mejor.
"""
#Entradas



while True:
    n=int(input("Ingrese la cantidad de medicinas:"))
    if 1 <= n <= 100:
        break
    else:
        print("Solo se aceptan numeros del 1 al 100")



while True:
    arr=str(input("Ingrese las medicinas que quiera ordenar."))
    arreglo=list(map(str,arr.split()[:n]))
    if len(arreglo)==n:
        break
    else: 
        print("Se esperaban", n, "medicinas intente de nuevo.")


    print(arreglo)


def selection_sort(arr):
    for i in range(len(arreglo)):
        min_actual=arreglo[i]
        #min_idx=i
        for j in range (i,len(arreglo)):
            if len(arr[j]) < len(min_actual):
                min_actual=arreglo[j]
                #min_idx=j
                arreglo[j]=arreglo[i]
                arreglo[i]=min_actual

        #arr[min_idx]=arr[j]
        #arr[i]=min_actual    

    return arreglo

print(arreglo) 
print(selection_sort(arreglo))  



