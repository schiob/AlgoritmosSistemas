def movimientos(jarras, capacidad_1, capacidad_2):#primera vez llega [5,0]
    llenar_jarra_1 = [capacidad_1, jarras[1]]#no entra
    llenar_jarra_2 = [jarras[0], capacidad_2]#[5,4] primera vez por que es diferente , entra en cuarta [4,4]
    vaciar_jarra_1 = [0, jarras[1]]#[0,4] segunda
    vaciar_jarra_2 = [jarras[0], 0]#no entra
    # Transferir de jarra 2 a jarra 1
    # Transferir de jarra 2 a jarra 1 
    transferir_a_jarra_1 = [min(jarras[0] + jarras[1], capacidad_1), jarras[1] - min(jarras[1], capacidad_1 - jarras[0])]#[4,0] tercera
    # Transferir de jarra 1 a jarra 2
    transferir_a_jarra_2 = [jarras[0] - min(jarras[0], capacidad_2 - jarras[1]), min(jarras[1] + jarras[0], capacidad_2)]#[5,3] quinta
    
    return [llenar_jarra_1, llenar_jarra_2, vaciar_jarra_1, vaciar_jarra_2, transferir_a_jarra_1, transferir_a_jarra_2]

def buscar_solucion(visitados, estado_actual, capacidad_1, capacidad_2, target):
    # Primero, verificamos si ya hemos estado en esta combinación de jarras antes.
    if estado_actual in visitados:
        return None
    visitados.append(estado_actual)
    
    if estado_actual[0] == target or estado_actual[1] == target:
        # Si es así, ¡hemos encontrado una solución! Devolvemos este estado.
        return [estado_actual]
    

    posibles_movimientos = movimientos(estado_actual, capacidad_1, capacidad_2)
    for nuevo_estado in posibles_movimientos:

        resultado = buscar_solucion(visitados, nuevo_estado, capacidad_1, capacidad_2, target)
        if resultado is not None:
            camino_hasta_ahora = [estado_actual]
            camino_completo = camino_hasta_ahora + resultado
            return camino_completo
    
    # Si probamos todos los movimientos posibles y ninguno nos dio una solución,
    # entonces no hay solución desde este punto y devolvemos None.
    return


capacidad_1 = 5
capacidad_2 = 4
target = 3
estado_inicial = [0, 0]
visitados = []
final = buscar_solucion(visitados, estado_inicial, capacidad_1, capacidad_2, target)
print(final)
