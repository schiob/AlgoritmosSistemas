

def valor_carta(n):
    if n == 'A':
        n = 1
    elif n == 'T':
        n = 10
    elif n == 'J':
        n = 11
    elif n == 'Q':
        n = 12
    elif n == 'K':
        n = 13
    else:
        n = int(n)
    return n


def valor_palo(n):
    if n == 'E':
        n = 1
    elif n == 'C':
        n = 2
    elif n == 'T':
        n = 3
    elif n == 'D':
        n = 4
    else:
        n = int(n)
    return n

def merge_sort(arr):
   
    if len(arr) > 1:
        
        mid = len(arr) // 2
        
        izquierda = arr[:mid]
        derecha = arr[mid:]

        
        merge_sort(izquierda)
        merge_sort(derecha)

        i =j =    k = 0
  
        while i < len(izquierda) and j < len(derecha):
           
            valor_izquierdo = izquierda[i]
            valor_derecho = derecha[j]
          
            if valor_izquierdo[0] == valor_derecho[0]:
                if valor_palo(valor_izquierdo[1]) < valor_palo(valor_derecho[1]):
                    arr[k] = izquierda[i]
                    i += 1
                else:
                    arr[j] = derecha[j]
                    j += 1
            
            elif valor_carta(valor_izquierdo[0]) < valor_carta(valor_derecho[0]):
                arr[k] = izquierda[i]
                i += 1
            else:
                arr[k] = derecha[j]
                j += 1
            k += 1

     
        while i < len(izquierda):
            arr[k] = izquierda[i]
            i += 1
            k += 1
        while j < len(derecha):
            arr[k]=derecha[j]
            j += 1
            k += 1

valor = ['A',2,3,4,5,6,7,8,9,'T','J','Q','K']

palo = ['E','C','T','D']

arr = []

vueltas= int(input(''))

for i in range(0,vueltas):
    arr2 = input('').split(' ')
    arr.append(arr2)
    arr[i].pop(0)

imprimir = ''
for i in range(0,vueltas):
    merge_sort(arr[i])
    imprimir += ' '.join(arr[i])
    imprimir += '\n'
print(imprimir)
