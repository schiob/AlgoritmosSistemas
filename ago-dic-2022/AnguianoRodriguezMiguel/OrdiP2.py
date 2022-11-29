def binarySearch(array, x, low, high):

    while low <= high:

        mid = low + (high - low)//2

        if array[mid] == x:
            return mid

        elif array[mid] < x:
            low = mid + 1

        else:
            high = mid - 1

    return -1


arr = ["TacosPastor 70","Teclado 200","Audífonos 1000","NintendoSwitch 9000","Iphone 15000","LaptopLenovo 20000"]
x = "TacosPastor 70"

result = binarySearch(arr, x, 0, len(arr)-1)

if result != -1:
    print("El producto esta en la posicion" + str(result))
else:
    print("No encontrado")