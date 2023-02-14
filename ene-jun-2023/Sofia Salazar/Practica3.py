medicamento=["CANDESARTAN HIDROCLOROTIAZIDA ALTER", "CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"]
print(medicamento)

if __name__ == "__main__":
    for i in range(0, len(medicamento)): #recorrer el arreglo
        actual=medicamento[i] #Posicion actual
        final=0
        for j in reversed(range(0,i)): 
            if len(medicamento[j])>len(actual):
                medicamento[j+1]=medicamento[j]
            else:
                final=j+1
                break
        medicamento[final]=actual

print(medicamento)