def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        left = []
        right = []
        for i in range(1, len(arr)):
            if arr[i][1] > pivot[1]:
                left.append(arr[i])
            elif arr[i][1] < pivot[1]:
                right.append(arr[i])
            else:
                if arr[i][2] > pivot[2]:
                    left.append(arr[i])
                elif arr[i][2] < pivot[2]:
                    right.append(arr[i])
                else:
                    if arr[i][3] > pivot[3]:
                        left.append(arr[i])
                    elif arr[i][3] < pivot[3]:
                        right.append(arr[i])
                    else:
                        if arr[i][0] < pivot[0]:
                            left.append(arr[i])
                        else:
                            right.append(arr[i])
        return quick_sort(left) + [pivot] + quick_sort(right)

n = int(input())
arr = []
for i in range(n):
    s, x, y, z = input().split()
    arr.append((s, int(x), int(y), int(z)))

sorted_arr = quick_sort(arr)

for i in range(n):
    print(sorted_arr[i][0])
