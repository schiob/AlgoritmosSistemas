#no supe como hacer este mas que nada que algoritmo usar intente modificar el de pokemons pero no supe acomodarlo del todo
# al final tome el quick y lo modifique para que se pudiera usar de esta manera simplemente pues
#amocoda los libros despues me da la posicion
#siento que pude hacerlo mas corto pero quedo asi que si funciona no le muevas ya aprendi

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        left = []
        right = []
        for i in range(1, len(arr)):
            if arr[i] < pivot:
                left.append(arr[i])
            else:
                right.append(arr[i])
        return quick_sort(left) + [pivot] + quick_sort(right)

def binary_search(arr, x):
    left = 0
    right = len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            left = mid + 1
        else:
            right = mid - 1
    return -1

n, x = input().split()
n = int(n)
books = input().split()

sorted_books = quick_sort(books)

pos = binary_search(sorted_books, x)

print(pos)

