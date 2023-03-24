def compare(a, b):
    if a[1] > b[1]:
        return -1
    elif a[1] < b[1]:
        return 1
    else:
        if a[2] > b[2]:
            return -1
        elif a[2] < b[2]:
            return 1
        else:
            if a[3] > b[3]:
                return -1
            elif a[3] < b[3]:
                return 1
            else:
                return 1 if a[0] > b[0] else -1

def quicksort(arr, l, r):
    if l < r:
        pivot = arr[(l+r)//2]
        i = l
        j = r
        while i <= j:
            while compare(arr[i], pivot) == -1:
                i += 1
            while compare(arr[j], pivot) == 1:
                j -= 1
            if i <= j:
                arr[i], arr[j] = arr[j], arr[i]
                i += 1
                j -= 1
        quicksort(arr, l, j)
        quicksort(arr, i, r)


def main():
  print("Cuantos participan?")
  n = int(input())
  arr = []
  for i in range(n):
      name, gold, silver, bronze = input().split()
      arr.append((name, int(gold), int(silver), int(bronze)))

  quicksort(arr, 0, n-1)
  print("Los ganadores en orden son:")
  for i in range(n):
      print(arr[i][0])


if __name__ == '__main__':
    main()
