def counting_sort(arr):
    max_val = max(arr)
    
    count = [0] * (max_val + 1)
    
    for num in arr:
        count[num] += 1
    
    sorted_arr = []
    for num, freq in enumerate(count):
        sorted_arr.extend([num] * freq)
    
    return sorted_arr

n = int(input()) 
arr = list(map(int, input().split()))  

sorted_arr = counting_sort(arr)
print(" ".join(map(str, sorted_arr)))
