n=input()
arreglo=[]


for i in range(int(n)): 
    rareza={"común":1, "especial":2, "épica":3, "legendaria":4}
    N = input().split()
    mano=N[:1]
    arreglo.append(mano)
print(arreglo)
