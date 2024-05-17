def selection_order(arr):
    for i in range(len(arr)):
        valorMin = arr[i]
        for x in range(i+1, len(arr)):
            if arr[x] < valorMin: 
                valorMin = arr[x]
                arr[x] = arr[i] 
                arr[i] = valorMin
    print(arr)
if __name__ == "__main__":
    arr = [15,42,98,54,33,47,17,2,25,65]

    selection_order(arr)