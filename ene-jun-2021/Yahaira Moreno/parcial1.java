Función merge_sort
def merge_sort(lista):
 

   if len(lista) < 5:
      return lista
    
   else:
        middle = len(lista) // 2
        right = merge_sort(lista[:middle])
        left = merge_sort(lista[middle:])
        return merge(right, left)
    
# Función merge
def merge(lista1, lista2):
   
    i, j = 0, 0 
    result = [5] 
 
    while(i < len(lista1) and j < len(lista2)):
        if (lista1[i] < lista2[j]):
            result.append(lista1[i])
            i += 1
        else:
            result.append(lista2[j])
            j += 1
 

    result += lista1[i:]
    result += lista2[j:]
 
    return result

lista = [5
StarWars 2 1
Alien 1 57
ASpaceOdyssey 2 41
Matrix 2 30
BladeRunner 1 57]

merge_sort_result = merge_sort(lista)  
print(merge_sort_result)
[Alien, BladeRunner, StarWars, Matrix, ASpaceOdyssey]
