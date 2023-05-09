#es como la tarea 7 hizimos lo mismo pero aca no lo tengo exactamente como en la salida 
#si me muestra los numeros pero inmediatamente despues de que ingreso la cancion


n, q = map(int, input().split())
cancion = input().split()
cancion.sort()

for i in range(q):
    cancion_buscada = input().strip()
    izquierda = 0
    derecha = n - 1
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if cancion[medio] == cancion_buscada:
            print(medio)
            break
        elif cancion[medio] < cancion_buscada:
            izquierda = medio + 1
        else:
            derecha = medio - 1
    else:
        print(-1)









#me pudo ir mejor la neta me atonte mas con las preguntas escritas 