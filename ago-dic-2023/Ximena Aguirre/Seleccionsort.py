numeros=[7,8,4,6,4,9,12,11]
for i in range(0,len(numeros)):
    min=i
for j in range(i+1, len(numeros)):
    if numeros[min]>numeros[j]:
        min=j

    temp=nums[i]
    nums[i]=numeros[min]
    numeros[min]=temp

print(numeros) 