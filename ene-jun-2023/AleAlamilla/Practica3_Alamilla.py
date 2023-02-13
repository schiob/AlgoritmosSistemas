print("Please Enter The Number Of Medicines To Add:")
n = int(input().strip())

medicines = []
for i in range(n):
    medicine = input().strip()
    medicines.append(medicine)

def sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and len(arr[j]) > len(key):
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr


print("The List Of Medicines Ordered From Shortest To Longest is:")
print(sort(medicines))





