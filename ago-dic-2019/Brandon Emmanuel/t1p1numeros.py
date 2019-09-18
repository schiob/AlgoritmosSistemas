array1= []
array2= []

print("ingresa numeros ")
for i in range (1,21):
    n=int(input())
    array1.append(n)
    if (n %2==0):
         array2.append(n)

print("numeros",array1)
print("numeros pares ",array2)
array2.reverse()
print("orden inverso", array2)

#apend va agregando al ultimo
#reverse, imprime al reves

# big o se enfoca en el peor de los casos




