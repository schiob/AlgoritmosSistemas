def countingSort(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10

    for i in range(n):
        index = (arr[i] // exp) % 10
        count[index] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = n - 1
    while i >= 0:
        index = (arr[i] // exp) % 10
        output[count[index] - 1] = arr[i]
        count[index] -= 1
        i -= 1

    for i in range(n):
        arr[i] = output[i]

def radixSort(arr):
    max_num = max(arr)
    exp = 1

    while max_num // exp > 0:
        countingSort(arr, exp)
        exp *= 10

if __name__ == "__main__":
    n = int(input())
    nums = list(map(int, input().split()))

    radixSort(nums)

    for num in nums:
        print(num, end=" ")
