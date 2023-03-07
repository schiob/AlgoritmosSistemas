def entrada(s):
    n=s.split()
    insert(n)
    
def insert(arre):
    for i in range(1,len(arre)):                           
        pos = arre[i]                                      
        j=0                                                 
        for j in reversed(range(0,i)):                     
            if len(arre[j])<len(pos):                                
                arre[j+1]=arre[j]
            else:
                j=j+1
                break                                       
            arre[j]=pos                                     
    print()                                                 
    print('La lista de dinosaurios ordenados es:')              
    print(arre)     
    

s=input('Ingresa los nombres de dinosaurios que quieres ordenar separandolos de un espacio:')   
entrada(s)