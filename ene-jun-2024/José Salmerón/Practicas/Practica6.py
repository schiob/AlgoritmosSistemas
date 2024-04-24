
def QuickSort(arr, low, high):
    if low < high:
        pi = Partition(arr, low, high)
        
        QuickSort(arr, low, pi-1)
        QuickSort(arr, pi+1, high)

def Partition(arr, low, high):
    pivot = arr[high]
    i = low -1
    for j in range(low, high):
        if arr[j] <= pivot:
            i = i+1
            (arr[i],arr[j]) = ( arr[j], arr[i])
    (arr[i+1],arr[high]) = (arr[high], arr[i+1])
    return i+1
    

if __name__ == "__main__":
    NumMed = int(input("Ingrese el número de medicinas:"))
    Med = str(input("Ingrese el nombre de las medicinas (Separelas con un espacio):"))
    MedList = Med.split()
    QuickSort(MedList,0,len(MedList)-1)
    print(MedList)