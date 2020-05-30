n=int(input())
arr=[]
for i in range(n):
  c=input().split()
  arr.append(c)

#quick sort
def quicksort(x):
    if len(x) == 1 or len(x) == 0:
        return x
    else:
        pivote = x[0]
        i = 0
        for j in range(len(x)-1):
            if x[j+1] < pivote:
                x[j+1],x[i+1] = x[i+1], x[j+1]
                i += 1
        x[0],x[i] = x[i],x[0]
        parte1 = quicksort(x[:i])
        parte2 = quicksort(x[i+1:])
        parte1.append(x[i])
        return parte1 + parte2

print(quicksort(arr))

#me tarde mucho haciendo el segundo y ya no pude completar este :c