def shellSort(array, n):
    gap = n // 2
    while gap > 0:
        for i in range(gap, n):
            temp = array[i]
            j = i
            while j >= gap and array[j - gap] > temp:
                array[j] = array[j - gap]
                j -= gap

            array[j] = temp
        gap //= 2



numero= int(input())
data=[numero]
data=input().split(" ")

data=list(map(int, data))
size = len(data)
shellSort(data, size)
print(data)



  


  

 


  

