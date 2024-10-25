import re
def alphanumeric_key(s):
    #Divido la cadena en partes a y n
    return [int(t) if t.isdigit() else t for t in re.split('([0-9]+)', s)]
def merge_sort(arr, key=None):
    if len(arr) > 1:
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]
        merge_sort(left_half, key)
        merge_sort(right_half, key)
        i = j = k = 0
        while i < len(left_half) and j < len(right_half):
            if key(left_half[i]) < key(right_half[j]):
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1
        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1
        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1
n = int(input())
words = input().split()
# Llamo merge sort 
merge_sort(words, key=alphanumeric_key)
print(" ".join(words))
