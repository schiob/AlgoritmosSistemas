def part(arr,low,high): 
    i = ( low-1 )          
    pivot = arr[high]       
    for j in range(low , high):    
        if   arr[j] <= pivot:         
            i = i+1 
            arr[i],arr[j] = arr[j],arr[i]   
    arr[i+1],arr[high] = arr[high],arr[i+1] 
    return ( i+1 ) 
                
def quickS(arr,bot,top): 
    if bot < top:  
        pi = part(arr,bot,top)    
        quickS(arr, bot, pi-1) 
        quickS(arr, pi+1, top)

def binS(arr, top, bot, x):
    mid = (top + bot)//2    
    if top > bot:
        return -1
    if arr[mid] == x:
        return mid
    if x < arr[mid]:
        return binS(arr, top, mid-1, x)
    else:
        return binS(arr, mid+1, bot, x)
    
n, m = map(int, input("").split())
arr = list(map(int, input("").split()))

quickS(arr, 0, len(arr)-1)
print(binS(arr, 0, len(arr)-1, m))