# INSERTIONSORT
def insertionSort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >=0 and key > arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key

        # INGRESAR LOS NUMEROS SEPARADOS POR UN ESPACIO,
        # arr =[int(e) for e in datos] HACE LA LISTA A NUMEROS  ENTEROS (INT)
        # El metodo for e in range (len(arr)):
        #      if arr[e] % 2 ==0:
        #           print (arr[e], end=" ")
        #             HACE QUE LOS NUMERO INGRESADOS SE LEEAN Y VERIFIQUEN
        #             QUE SEAN NUMEROS PARES Y LOS IMPRIMA A LOS NUMEROS IMPARES NO LOS IMPRIME
        
datos=input("Ingrese los numeros\n").split(" ")
arr =[int(e) for e in datos]
insertionSort(arr)
print("datos ordenados")
for e in range (len(arr)):
     if arr[e] % 2 ==0:
          print (arr[e], end=" ")

#           Entrada
# 3 43 2 5 4 6 5 4 334 45 23 123 323 45 34 23 43 5 46 78
# Salida
# 334 78 46 34 6 4 4 2
