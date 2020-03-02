class netflix():
    def __init__(self,nombre,hora,minuto):
        self.nombre=nombre
        self.hora=hora
        self.minuto=minuto
        
    def compareTo(self,p2):
        # hora
        if self.hora < p2.hora:
            return True
        elif self.hora == p2.hora:
            #minuto
            if self.minuto < p2.minuto:
                return True
            elif self.minuto == p2.minuto:
                #nombre
                if self.nombre < p2.nombre:
                    return True
                elif self.nombre == p2.nombre:
                    return True
                        
        return False   
     
def main():
    n=int(input())
    arr =[]
    for _ in range(n):
        line = input().split()

        nombre = line[0]
        hora = line[1]
        minuto = line[2]
        
        newobj = netflix(nombre,hora,minuto)
        arr.append(newobj)

#bubble
    for i in range(n):
        for j in range(n-i-1):
            if not arr[j].compareTo(arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]

    for p in arr:
        print(p.nombre,end=' ') # el end hace que en lugar de hacer un salto de linea se vaya en la misma
if __name__ == "__main__":
    main()
