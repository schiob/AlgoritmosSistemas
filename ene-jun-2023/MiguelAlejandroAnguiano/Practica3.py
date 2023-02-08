medicina=["CANDESARTAN HIDROCLOROTIAZIDA ALTER", "CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"]
print(medicina)

if __name__ == "__main__":
    for i in range(0, len(medicina)): #recorrer el arreglo
        actu=medicina[i] #Posicion actual
        final=0
        for j in reversed(range(0,i)): #Recorrer desde la posicion actual a cero
            if len(medicina[j])>len(actu):
                medicina[j+1]=medicina[j] #intercambiar el mayor a la posicion actual
            else:
                final=j+1
                break
        medicina[final]=actu

print(medicina)