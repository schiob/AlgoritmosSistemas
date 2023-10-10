n=int(input("Introduce el número de libros:"))
libros = []

for _ in range(n):
    entrada=input().split()
    paginas=int(entrada[-1]) 
    nombre=" ".join(entrada[:-1]) 
    libros.append((nombre, paginas))

def merge_sort(arr):
    if len(arr)==1:
        return arr

    mitad=len(arr)//2
    mitad_izquierda=arr[:mitad]
    mitad_derecha=arr[mitad:]

    mitad_izquierda=merge_sort(mitad_izquierda)
    mitad_derecha=merge_sort(mitad_derecha)

    return merge(mitad_izquierda,mitad_derecha)

def merge(izquierda,derecha):
    resultado=[]
    apu_izq=0
    apu_dere=0

    while apu_izq<len(izquierda) and  apu_dere<len(derecha):
        if izquierda[apu_izq][1]<derecha[apu_dere][1]:
            resultado.append(izquierda[apu_izq])
            apu_izq+=1
        else:
            resultado.append(derecha[apu_dere])
            apu_dere+=1

    resultado.extend(izquierda[apu_izq:])
    resultado.extend(derecha[apu_dere:])
    return resultado

libros_ordenados=merge_sort(libros)
print(libros_ordenados)


