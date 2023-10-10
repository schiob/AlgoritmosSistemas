n=input('Cuantos datos ingresaras: ')                    
n=int(n)                                                 
arre=[] 
arreimp=[]                                                 
for i in range(n):                                      
    datoarre = input(f"Ingresa el número {i+1}: ")      
    datoarre = int(datoarre)                            
    arre.append(datoarre)                               
print()                                                 
print('La lista de numeros ingresados es:')             
print(arre)                                             
for i in range(1,len(arre)):                            
    pos = arre[i]                                       
    j=0                                                  
    for j in reversed(range(0,i)):
        if arre[j]<pos:
            arre[j+1]=arre[j]
        else:
            j=j+1
            break                                        
    arre[j]=pos                                         
print()                                                 
print('La lista de numeros ordenados es:')              
print(arre)   
for i in range(0,len(arre)):
    if arre[i]%2!=0:
        arreimp.append(arre[i])
print()                                                 
print('La lista de numeros impares es:')              
print(arreimp)