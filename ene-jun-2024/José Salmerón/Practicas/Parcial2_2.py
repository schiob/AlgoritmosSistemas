#EJERCICIO 2
def QuickSort(arr, low, high):
    if low < high:
        pi = Partition(arr, low, high)
        
        QuickSort(arr, low, pi-1)
        QuickSort(arr, pi+1, high)
    return arr

def Partition(arr, low, high):
    pivot = arr[high]
    i = low -1
    for j in range(low, high):
        if arr[j] <= pivot:
            i = i+1
            (arr[i],arr[j]) = ( arr[j], arr[i])
    (arr[i+1],arr[high]) = (arr[high], arr[i+1])
    return i+1

#/////////////////////////////////////////////////////////////////////////////////////////////

def BinarySearchSongs(arr, start, end, var):
    if end < start:
        return "No se encontró la canción:",var
    mid = (end+start) // 2
    if arr[mid] == var:
        return mid
    if var < arr[mid]:
        return BinarySearchSongs(arr,start,mid-1,var)
    else:
        return BinarySearchSongs(arr,mid+1,end,var)

if __name__ == "__main__":
    #Songs = "8 4"
    #Playlist = "FiestaDeLocos Matador Comprendes,Mendes? PadreNuestro YoTomo Frijolero SiSeñor Imagina"
    #Peticiones = ["SiSeñor","Imagina","PadreNuestro","Matador"]
    Songs = str(input("Ingrese la cantidad de canciones en la playlist y el número de peticiones: "))
    Playlist = str(input("Ingrese los nombres de las canciones en su playlist (Separados con espacios): "))
    Songs = Songs.split()
    Playlist = Playlist.split()
    QuickSort(Playlist,0,len(Playlist)-1)
    Peticiones = []
    for i in range(0, int(Songs[1])):
        Peticiones.append(str(input("Ingrese el nombre de la canción que busca: ")))
    print(Playlist)
    for i in range(0, int(Songs[1])):
        print(BinarySearchSongs(Playlist,0,len(Playlist)-1,Peticiones[i]))
        
        
