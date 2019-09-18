tareas=[]
n= int(input("ingresa la cantidad de problemas: "))
m=int(input("ingresa la cantidad de tiempo disponible: "))

#número de minutos de las tareas
for i in range (n):
    t=int(input())
    tareas.append(t)
for i in range (1,len(tareas)):
    temp = tareas[i]
    j=i-1
    while j>=0 and temp<tareas[j]: # aqui empieza a comparar cada uno de los elementos de la cadena
        tareas[j+1]=tareas[j]
        j=j-1
    tareas[j+1]=temp
resultado=0

for i in range (n):
    if m>=tareas[i] and m>=0:
        resultado=resultado+1
        m=m-tareas[i]
print(f"tareas que puedes realizar: {resultado}")