def Merge(data):

    if len(data) > 1:
        div = len(data)//2
        izq = data[:div]
        der = data[div:]
        Merge(izq)
        Merge(der)

        i = j = k = 0
        while i < len(izq) and j < len(der):
            if int(izq[i][1]) <= int(der[j][1]) and int(izq[i][2]) <= int(der[j][2]):
                data[k] = izq[i]
                i+=1
            else: 
                data[k] = der[j]
                j+=1
            k+=1
        while i < len(izq):
            data[k] = izq[i]
            i+=1
            k+=1
        while j < len(der):
            data[k] = der[j]
            j+=1
            k+=1

data = []
n = int(input())
for i in range(n):
    x = input().split()
    data.append(x)
Merge(data)
for i in data:
    print(''.join(i[0]), end=" ") 