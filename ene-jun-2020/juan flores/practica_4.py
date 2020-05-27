def mergesort(arr):
    if len(arr)>1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        mergesort(L)
        mergesort(R)
        i=j=k=0
        v = {'A':1,'T':10,'J':11,'Q':12,'K':13}
        p = {'E':1,'C':2,'T':3,'D':4}
        while i < len(L) and j < len(R):
            l = [int(L[i][0]) if L[i][0].isnumeric() else v[L[i][0]],
                 int(L[i][1]) if L[i][1].isnumeric() else p[L[i][1]]]
            r = [int(R[j][0]) if R[j][0].isnumeric() else v[R[j][0]],
                 int(R[j][1]) if R[j][1].isnumeric() else p[R[j][1]]]
            if l[0] == r[0]:
                if l[1] < r[1]:
                    arr[k] = L[i] 
                    i+=1
                else:
                    arr[k] = R[j] 
                    j+=1
            elif l[0] < r[0]: 
                arr[k] = L[i]
                i+=1
            else: 
                arr[k] = R[j] 
                j+=1
            k+=1
        while i < len(L): 
            arr[k] = L[i] 
            i+=1
            k+=1
          
        while j < len(R): 
            arr[k] = R[j] 
            j+=1
            k+=1

n = int(input())
manos = []
for i in range(n):
    manos.append(input().split()[1:])
print()
for i in range(n):
    mergesort(manos[i])
    print(" ".join(manos[i]))