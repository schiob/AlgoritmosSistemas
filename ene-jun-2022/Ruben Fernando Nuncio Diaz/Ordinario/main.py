#problema 1 Ordenando los colores
lst = []
arcoiris = ['Rojo', 'Anaranjado', 'Amarillo', 'Verde', 'Indigo', 'Violeta', 'Azul']
n = int(input())

for i in range(0, n):
    ele = input().split("-")
    lst.append(ele)





def ordenarNombre():

    nombres_ordenados = []
    for i in range(len(lst)):
        if lst[i][0] == arcoiris[0]:
            nombres_ordenados.append('Rojo')
        elif lst[i][0] == arcoiris[1]:
            nombres_ordenados.append('Anaranjado')
        elif  lst[i][0] == arcoiris[3]:
            nombres_ordenados.append('Amarillo')
        elif lst[i][0] == arcoiris[4]:
            nombres_ordenados.append('Verde')
        elif lst[i][0] == arcoiris[5]:
            nombres_ordenados.append('Indigo')
        elif  lst[i][0] == arcoiris[6]:
            nombres_ordenados.append('Violeta')
        elif lst[i][0] == arcoiris[7]:
            nombres_ordenados.append('Azul')
        else: break
    print(nombres_ordenados[::-1])


def partition(array, low, high):


  pivot = array[high]


  i = low - 1


  for j in range(low, high):
    if array[j] <= pivot:

      i = i + 1

      (array[i], array[j]) = (array[j], array[i])

  (array[i + 1], array[high]) = (array[high], array[i + 1])

  return i + 1

def quickSort(array, low, high):
  if low < high:


    pi = partition(array, low, high)


    quickSort(array, low, pi - 1)

    quickSort(array, pi + 1, high)

data = lst



size = len(data)

quickSort(data, 0, size - 1)


ordenarNombre()




#################################################################################################################
lst = []

n = int(input())

for i in range(0, n):
    ele = input().split("-")
    lst.append(ele)


def binarySearch(arr, l, r, x):
    if r >= l:

        mid = l + (r - l) // 2

        if arr[mid] == x:
            return mid


        elif arr[mid] > x:
            return binarySearch(arr, l, mid - 1, x)


        else:
            return binarySearch(arr, mid + 1, r, x)

    else:
        return -1



arr = lst
x = 10

# Function call
result = binarySearch(arr, 0, len(arr) - 1, x)

if result != -1:
    print("" % result)
else:
    print("-1")




