#Obtenemos el primer renglon
entrada1 = input("Escribe primero el numero de problemas y con un espacio escribe el tiempo que tienes: ")
ltareas = entrada1.split(" ")
#numero de problemas
n = int(ltareas[0])
#tiempo disponible
m = int(ltareas[-1])
#print(type(m), m)
#obtenemos el segundo renglon
entrada2 = input("Escribe el tiempo que te tardas en resolver los problemas separados por una espacio: ")
#lista de comprencion
entrada2 = [int(i) for i in entrada2.split(" ")]
#lista ordenada usando insertion sort
for i in range(1, len(entrada2)):
    llave = entrada2[i]
    j = i-1
    while(j > 0 and llave < entrada2[j]):
        entrada2[j+1] = entrada2[j]
        j -= 1
    entrada2[j+1] = llave

ltiempo = entrada2
#ltiempo = sorted(entrada2)
#obtenemos el resultadop
contador = 0
if (ltiempo[0] > m):
    print("No puedes resolver ningun problema")
else:
    for i in ltiempo:
        # print(f"Valor actual de la iteracion {i}")
        # print(f"Valro de la resta {m-i}")
        m = m - i
        #print(f"Valor de m {m}")
        if (m >= 0):
            #print(f"Valor de m {m}\nValor de i {i}\nValor de la resta {m-i}")
            contador += 1
            #print(f"Este es el contador {contador}")

    print(f"Numero de problemas que puedes resolver -> {contador}")