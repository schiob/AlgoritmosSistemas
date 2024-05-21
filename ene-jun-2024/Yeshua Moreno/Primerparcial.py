# Parcial 1 - Mucho Más ordenamiento
#A mi tío Bartolo le encantan los relojes, muchos de los que tiene ya no funcionan y se quedaron con una 
# hora fija en sus manecillas y/o dígitos. Mi tío tiene una fijación muy particular y quiere que 
# los relojes estén acomodados de menor a mayor según la hora que tengan marcados, 
# ayudalo a ordenar sus relojes de esta forma.
### Input
#La entrada será recibida por **STDIN**
#Consiste en varias lineas, la primera tiene un entero **n** 
# representado el número de relojes que tiene Bartolo.
#Después hay **n** líneas en la que cada una tiene un string con la hora del reloj x, 
#en formato de 12 hrs con el string PM o AM al final respectivamente.
### Output
#Imprime a salida estandar **STDOUT** la lista con los relojes ordenados.
### Ejemplos
#### Entrada
#```
#6
#01:23 AM
#11:01 PM
#12:54 AM
#09:00 PM 
#12:30 PM
#02:12 AM
#```
#### Salida
#```
#12:54 AM
#01:23 AM
#02:12 AM
#12:30 PM
#11:01 PM
#09:00 PM 
#```
### Notas
#Resuelve el problema haciendo una implementación de MergeSort.

def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        arr_urss = arr[:mid]
        arr_usa = arr[mid:]

        merge_sort(arr_urss)
        merge_sort(arr_usa)

        i = j = k = 0

        while i < len(arr_urss) and j < len(arr_usa):
            if arr_urss[i] < arr_usa[j]:
                arr[k] = arr_urss[i]
                i += 1
            else:
                arr[k] = arr_usa[j]
                j += 1
            k += 1

        while i < len(arr_urss):
            arr[k] = arr_urss[i]
            i += 1
            k += 1

        while j < len(arr_usa):
            arr[k] = arr_usa[j]
            j += 1
            k += 1

def para_que_este_en_minutos(time_str):
    hour, minute = map(int, time_str[:-3].split(':'))
    if time_str.endswith('PM') and hour != 12:
        hour += 12
    return hour * 60 + minute

def tiempoxd(minutes):
    hour = minutes // 60
    minute = minutes % 60
    suffix = 'AM' if hour < 12 else 'PM'
    if hour > 12:
        hour -= 12
    elif hour == 0:
        hour = 12
    return '{:02d}:{:02d} {}'.format(hour, minute, suffix)

if __name__ == "__main__":
    n = int(input("Ingrese la cantidad de tiempos: "))
    tiempos = []
    for _ in range(n):
        tiempos.append(input("Ingrese un tiempo en formato hh:mm AM/PM: ").strip())

    tiempo = [para_que_este_en_minutos(time) for time in tiempos]
    merge_sort(tiempo)

    sorted_tiempos = [tiempoxd(minutos) for minutos in tiempo]

    for time in sorted_tiempos:
        print(time)