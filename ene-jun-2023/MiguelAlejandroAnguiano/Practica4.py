arr=[1432,230,1980,1689,400]
print(arr)

for i in range(0,len(arr)):
    for j in range(0,len(arr)-1):
        if arr[j] < arr[j+1]:
            temp=arr[j]
            arr[j]=arr[j+1]
            arr[j+1]=temp
        i+=1
        j+=1
print(arr)