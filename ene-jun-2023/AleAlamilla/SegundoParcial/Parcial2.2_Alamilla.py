import bisect

def quicksort(list):
    if len(list) < 2:
        return list
    else:
        pivo = list[0]
        lowest = [i for i in list[1:] if i <= pivo]
        highest = [i for i in list[1:] if i > pivo]
        return quicksort(lowest) + [pivo] + quicksort(highest)


def binary_search(list, item):
    i = bisect.bisect_left(list, item)
    if i != len(list) and list[i] == item:
        return i
    else:
        return -1 

def main():
      n, q = map(int, input().split())
      playlist = input().split()
      searchs = [input().strip() for _ in range(q)]

      playlist = quicksort(playlist)

      print(" ".join(playlist))

      for song in searchs:
          print(binary_search(playlist, song))


if __name__ == '__main__':
    main()
