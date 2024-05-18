def convertir_a_minutos(hora_str):
    hora, minutos = map(int, hora_str[:-6].split(":"))
    if "PM" in hora_str and hora != 12:
        hora += 12
    elif "AM" in hora_str and hora == 12:
        hora = 0
    return hora * 60 + minutos

def convertir_a_hora(minutos):
    horas = minutos // 60
    minutos %= 60
    periodo = "PM" if horas >= 12 else "AM"
    if horas > 12:
        horas -= 12
    elif horas == 0:
        horas = 12
    return f"{horas:02d}:{minutos:02d} {periodo}"

def merge_sort(arr):
    if len(arr) > 1:
        middle = len(arr) // 2
        arr_izq = arr[:middle]
        arr_der = arr[middle:]

        merge_sort(arr_izq)
        merge_sort(arr_der)

        i, j, k = 0, 0, 0

        while i < len(arr_izq) and j < len(arr_der):
            if arr_izq[i] < arr_der[j]:
                arr[k] = arr_izq[i]
                i += 1
            else:
                arr[k] = arr_der[j]
                j += 1
            k += 1

        while i < len(arr_izq):
            arr[k] = arr_izq[i]
            i += 1
            k += 1

        while j < len(arr_der):
            arr[k] = arr_der[j]
            j += 1
            k += 1


if __name__ == "__main__":
    n = int(input())
    watches = []

    for _ in range(n):
        watches.append(input().strip())

    watches = sorted(watches, key=convertir_a_minutos)

    for watch in watches:
        print(convertir_a_hora(watch))
