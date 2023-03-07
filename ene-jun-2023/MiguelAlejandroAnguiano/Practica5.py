def main():
    casos = int(input())

    for _ in range(casos):
        line = input().split()
        numcartas = int(line[0])
        cartas = line[1:numcartas + 1]

        sorted_cards = OrdenarCartas(cartas)

        for carta in sorted_cards:
            print(carta, end="")
        print()

def numValue(carta):
    value=0
    first = carta[0]
    if first=="A":
        value=1
    if first=="T":
        value=10
    if first=="J":
        value=11
    if first=="Q":
        value=12
    if first=="K":
        value=13

    second=carta[1]
    if second=="E":
        value+=.1
    if second=="C":
        value+=.2
    if second=="T":
        value+=.3
    if second=="D":
        value+=.4

def cardValue(num):
    value=0
    first = num[0]
    if first==1:
        value="A"
    if first==10:
        value="T"
    if first==11:
        value="J"
    if first==12:
        value="Q"
    if first==13:
        value="K"

    second=(num*10)%10
    if second==1:
        value+="E"
    if second==2:
        value+="C"
    if second==3:
        value+="T"
    if second==4:
        value+="D"

def OrdenarCartas(cartas):
    #hash
    arr=[]
    for carta in cartas:
        arr.append(numValue(carta))

    #Sort
    sort_arr=MergeSort(arr)

    #Unhash
    sorted_cards=[]
    for carta in cartas:
        arr.append(cardValue(carta))

def MergeSort(cartas):
    if len(cartas) <= 1:
        return cartas
        # Divide la lista en dos mitades
    mid = len(cartas) // 2
    leftarr = cartas[:mid]
    rightarr = cartas[mid:]
    # Recursivamente ordena cada mitad
    leftarr = OrdenarCartas(leftarr)
    rightarr = OrdenarCartas(rightarr)
    # Combina las dos mitades ya ordenadas
    return merge(leftarr, rightarr)

def merge(leftarr, rightarr):
    resultado = []
    i = j = 0
    # Recorre ambas listas y agrega los elementos en orden
    while i < len(leftarr) and j < len(rightarr):
        if leftarr[i] < rightarr[j]:
            resultado.append(leftarr[i])
            i += 1
        else:
            resultado.append(rightarr[j])
            j += 1

    return resultado

if __name__ == "__main__":
    main()