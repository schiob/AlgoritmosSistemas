def binarySearch(arr, inicio, fin, x):
    
    middle = (inicio + fin)//2
    if inicio > fin:
        return -1
    if arr[middle][0] == x :
        return middle
    if x < arr[middle][0]:
        return binarySearch(arr, inicio, middle-1, x)
    else:
        return binarySearch(arr, middle+1, fin, x)

if __name__ == "__main__":    
    numart,x = input().split()
    arr = []
    for i in range(int(numart)):
        articulo = input().split()
        arr.append(articulo)
    print()
    print(binarySearch(arr, 0, len(arr), x)+1)