def busqueda(arr, inicio, fin, x):
    if inicio> fin:
        return -1

    medio=(inicio + fin )//2#validar
    if arr[medio]==x:
        return medio

    if x<arr[medio]:
        return busqueda(arr, inicio, medio-1, x) #izquierda

    else:
        return busqueda(arr, medio+1, fin, x) #derecha

if __name__ == '__main__':
    arr=[]
    n=int(input("número de tazos en la colección: "))
    x=input("numero de serie del tazo que busca: ")
    for i in range(n):
        tazo= input("# tazos de juan: ")
        arr.append(tazo)
    arr=sorted(arr)
    print(busqueda(arr,0,len(arr)-1,x))