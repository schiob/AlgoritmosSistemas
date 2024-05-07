if __name__ == "__main__":
    print("Introduce el número de libros en el estante de Mate, y el nombre de tu libro")
    temp = input()
    arr = temp.split(' ')
    a = arr[0]
    b = arr[1]
    print("Introduce el nombre de cada libro en el estante, separado por espacios")
    temp = input()
    arr2 = temp.split(' ')
    print(arr2)

    for i in range (len(arr2)):
        if b == arr2[i]:
            print(i+1)
            break
        if len(arr2)-1 == i:
                print("-1" + " Not found")
                break
            


    