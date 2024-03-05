def start():
     print("Cuantos relojes tiene el tio bartolo?")
     a = input()
     a = int(a)
     arr = [0]* a
     for i in range(a):
        print("Introduce la hora en la que se quedo atascado el reloj ", i+1 ,": ")
        arr[i] = input()
     return arr

def mergesort(arr):
    if len(arr) == 1:
        return arr

    middle = len(arr)//2
    arr_izq = arr[:middle]
    arr_der = arr[middle:]

    arr_der_ordenado = mergesort(arr_der)
    arr_izq_ordenado = mergesort(arr_izq)

    print(arr_der)
    print(arr_izq)

    arr_ordenado = juntar(arr_izq_ordenado, arr_der_ordenado)
    return arr_ordenado
    
def juntar(arr_izq, arr_der):
    arr_ordenado = [0] * (len(arr_izq)+len(arr_der))
    print(arr_ordenado)
    z = 0
    x = 0
    y = 0

    while z < (len(arr_izq) + len(arr_der)) and x < len(arr_izq) and y < len(arr_der):
         if 'A' or 'a' in arr_izq[x] and 'A' or 'a' in arr_der[x]:
              if arr_izq[x] < arr_der[y]:
                arr_ordenado[z]=arr_izq[x]
                x+=1
                z+=1
              else:
                arr_ordenado[z]=arr_der[y]
                z+=1
                y+=1

         elif 'P' or 'p' in arr_izq[x] and 'P' or 'p' in arr_der[x]:
             if arr_izq[x] < arr_der[y]:
                arr_ordenado[z]=arr_izq[x]
                x+=1
                z+=1
             else:
                arr_ordenado[z]=arr_der[y]
                z+=1
                y+=1
        
         elif 'A' or 'a' in arr_izq[x] and 'P' or 'p' in arr_der[x]:
             arr_ordenado[z]=arr_izq[x]
             x+=1
             z+=1

         elif 'P' or 'p' in arr_izq[x] and 'A' or 'a' in arr_der[x]:
             arr_ordenado[z]=arr_der[y]
             z+=1
             y+=1
         
    return arr_ordenado
         

if __name__ == "__main__":

     arr = start()
     arr_ordenado = mergesort(arr)
     print(arr_ordenado)