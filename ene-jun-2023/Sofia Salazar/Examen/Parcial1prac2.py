def peliculas():
    arreglo=['StarWars 2 1','Alien ,1, 57','ASpaceOdyssey 2 41','Matrix 2 30','BladeRunner 1 57']
    peliculas=[]
    for _ in range(len(arreglo)):
        nombre, hora, minutos = input().split()
        tiempo = int(hora) * 60 + int(minutos)
        peliculas.append((tiempo, nombre))

    for peliculas in peliculas:
        hora = tiempo // 60
        minutos = tiempo % 60
        print(nombre, hora, minutos)

def mergeSort(peliculas):
    if len(peliculas) == 1:
        return peliculas

    #Separar en subproblemas
    mitad = len(peliculas)/2
    izquierda = peliculas[0:mitad]
    derecha = [mitad,len(peliculas)]

    #Resolver de forma recursiva
    izquierda_sorted = mergeSort(izquierda)
    derecha_sorted = mergeSort(derecha)

    #Unir las soluciones para la solucion
    original_sorted = join(izquierda_sorted, derecha_sorted)
    return original_sorted

def join(izquierda, derecha):
    resultado=[]
    i=0
    j=0
    while(i<len(izquierda)&j<len(derecha)):
        if(izquierda[i]<derecha[j]):
            resultado.append(izqueirda[i])
            i+=1
        else:
            resultado.append(derecha[j])
            j+=1
    resultado.append=izquierda[i]
    resultado.append=derecha[j]
    return resultado