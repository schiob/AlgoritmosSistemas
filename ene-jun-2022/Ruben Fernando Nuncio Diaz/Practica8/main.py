class MySort:

    def display(self, arr, size):
        i = 0
        while (i < size):
            print(" ", arr[i], end="")
            i += 1

        print("\n", end="")

    # Swap the array element
    def swap(self, arr, first, second):
        temp = arr[first]
        arr[first] = arr[second]
        arr[second] = temp

    def part(self, arr, low, high):
        pv = arr[high]
        i = low - 1
        j = low
        while (j < high):
            if (arr[j] < pv):
                i += 1
                self.swap(arr, i, j)

            j += 1

        self.swap(arr, i + 1, high)
        return i + 1

    def quick_sort(self, arr, low, high):
        if (low < high):
            pv = self.part(arr, low, high)
            self.quick_sort(arr, low, pv - 1)
            self.quick_sort(arr, pv + 1, high)

def main():
    lst = []
    obj = MySort()
    n = int(input())
    for i in range(0, n):
        ele = [input(), int(input())]
        lst.append(ele)


    size = len(lst)
    obj.display(lst, size)
    obj.quick_sort(lst, 0, size - 1)

    obj.display(lst, size)


if __name__ == "__main__":
    main()

