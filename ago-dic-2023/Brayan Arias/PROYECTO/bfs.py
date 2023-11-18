def movimientos(jarras, capacidad_1, capacidad_2):
    llenar_jarra_1 = [capacidad_1, jarras[1]]
    llenar_jarra_2 = [jarras[0], capacidad_2]
    vaciar_jarra_1 = [0, jarras[1]]
    vaciar_jarra_2 = [jarras[0], 0]
    
    # Transferir de jarra 2 a jarra 1
    transferir_a_jarra_1 = [min(jarras[0] + jarras[1], capacidad_1), jarras[1] - min(jarras[1], capacidad_1 - jarras[0])]
    
    # Transferir de jarra 1 a jarra 2
    transferir_a_jarra_2 = [jarras[0] - min(jarras[0], capacidad_2 - jarras[1]), min(jarras[1] + jarras[0], capacidad_2)]
    
    # Devolver todas las posibilidades
    return [llenar_jarra_1, llenar_jarra_2, vaciar_jarra_1, vaciar_jarra_2, transferir_a_jarra_1, transferir_a_jarra_2]

def part(visitados, nuevos,basura):
    jarra_1 =basura[0]
    jarra_2 =basura[1]
    target = basura[2]
    
    if not nuevos:
        print(visitados)
        return "No hay forma"
        
    
    proximos = []
    for movimiento in nuevos:
        
        if movimiento not in visitados:
            visitados.append(movimiento)
            if movimiento[0] == target or movimiento[1] == target:
                return visitados
            
            proximos=proximos+(movimientos(movimiento, jarra_1, jarra_2))
            
    
    return part(visitados, proximos,basura)  # Recursividad con nuevos estados

nuevos = [[0, 0]]
visitados = []
basura=[5,4,3]
final = part(visitados, nuevos,basura)
print(final)
