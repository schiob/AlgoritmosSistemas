def comparar_hora(hora1, hora2):
    hora1_split = hora1.split()
    hora2_split = hora2.split()
    
    hora1_hora, hora1_minuto = map(int, hora1_split[0].split(':'))
    hora2_hora, hora2_minuto = map(int, hora2_split[0].split(':'))

    if hora1_split[1] == 'AM' and hora2_split[1] == 'PM':
        return True
    elif hora1_split[1] == 'PM' and hora2_split[1] == 'AM':
        return False
    else:
        if hora1_hora == 12:
            hora1_hora = 0
        if hora2_hora == 12:
            hora2_hora = 0
        
        if hora1_hora < hora2_hora:
            return True
        elif hora1_hora > hora2_hora:
            return False
        else:
            if hora1_minuto < hora2_minuto:
                return True
            else:
                return False

    
def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        L = arr[:mid]
        R = arr[mid:]

        merge_sort(L)
        merge_sort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if comparar_hora(L[i], R[j]):
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1

def main():
    n = int(input("Ingrese el número de relojes: "))
    relojes = []
    for i in range(n):
        hora = input("Ingrese la hora del reloj en formato hh:mm AM/PM: ")
        relojes.append(hora)

    merge_sort(relojes)

    print("Relojes ordenados:")
    for reloj in relojes:
        print(reloj)

if __name__ == "__main__":
    main()       
        
    