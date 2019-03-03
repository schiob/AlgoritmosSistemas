from quicksort import *
from binarysearch import *

ln = input().split()
arr = input().split()
n = len(arr)
x = ln[1]

quickSort(arr, 0, n-1)
print(binarySearch(arr, 0, n-1, x))