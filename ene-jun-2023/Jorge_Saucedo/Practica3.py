def entrada(n):
    n=int(n)                                                
    arre=[]                                                 
    for i in range(n):                                     
        datoarre = input(f"Ingresa el medicamento num {i+1}: ")                           
        arre.append(datoarre)                              
    print()                                                
    print('La lista de medicamentos ingresados es:')            
    print(arre)   
    insert(arre)
    
def insert(arre):
    for i in range(1,len(arre)):                           
        pos = arre[i]                                      
        j=0                                                 
        for j in reversed(range(0,i)):                     
            if len(arre[j])>len(pos):                                
                arre[j+1]=arre[j]
            else:
                j=j+1
                break                                       
            arre[j]=pos                                     
    print()                                                 
    print('La lista de medicamentos ordenados es:')              
    print(arre)   
    
n=input('Cuantos medicamentos ingresaras: ')   
entrada(n)