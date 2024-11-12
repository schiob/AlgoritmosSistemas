def cs(arr):
    mv = max(arr)
    count = [0] * (mv +1)
    for n in arr:
        count [n] += 1
    sorted_arr = []
    for n, cnt in enumerate(count):
        sorted_arr.extend([n] * cnt) 
    return sorted_arr
n = int(input())
arr = list(map(int, input().split()))
sorted_arr = cs(arr)
print(" ".join(map(str, sorted_arr)))
