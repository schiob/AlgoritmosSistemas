class MyArray:
    def display(self, arr):
        i = 0
        while (i < len(arr)):
            print(" ", arr[i], end="")
            i += 1

    def find_node(self, arr, size, element):
        i = 0
        j = (size - 1)
        mid = 0

        if (arr[i] == element):
            return i
        elif (arr[j] == element):
            return j

        while (j > i):
            mid = int((i + j) / 2)
            if (arr[mid] > element):
                j = mid - 1
            elif (arr[mid] < element):
                i = mid + 1
            else:
                return mid

        return -1

    def binary_search(self, arr, element):
        size = len(arr)
        if (size <= 0):
            return

        location = self.find_node(arr, size, element)
        if (location == -1):
            print("\n ", element, "-1", end="")
        else:
            print("\n ", element, location, end="")


def main():
    obj = MyArray()
    n = int(input(""))
    buscar = input()

    lst = [input("") for _ in range(n)]

    obj.binary_search(lst, buscar)


if __name__ == "__main__":
    main()



###############################################################################################################




from queue import PriorityQueue

lst = []

n = int(input(""))
lst = [input("") for _ in range(n)]

lst_numeros = list(map(lambda x: x.split(' ')[1], lst))

lst_nombres = list(map(lambda x: x.split(' ')[0], lst))




for i in range(n):
    lst_numeros[i] = int(lst_numeros[i])



class MySort:
    # Function which is display array elements
    def display(self, arr, size):
        i = 0
        while (i < size):
            print(" ", arr[i], end="")
            i += 1

        print("\n", end="")

    def merge_elements(self, arr, front, tail, middle):
        # Get the size of first subarray
        s1 = (middle - front) + 1
        # Get the size of second subarray
        s2 = tail - middle
        # Creating auxiliary storage to store elements
        first_subarray = [0] * s1
        second_subarray = [0] * s2
        # Loop controlling variables
        i = 0
        j = 0
        counter = 0
        # Get the elements of first subarray
        i = 0
        while (i < s1):
            first_subarray[i] = arr[front + i]
            i += 1

        i = 0
        while (i < s2):
            second_subarray[i] = arr[middle + i + 1]
            i += 1

        i = 0
        while (counter < s1 + s2):
            if (i < s1 and j < s2):
                if (first_subarray[i] <= second_subarray[j]):
                    arr[front + counter] = first_subarray[i]
                    i += 1
                else:
                    arr[front + counter] = second_subarray[j]
                    j += 1


            elif (i < s1):
                arr[front + counter] = first_subarray[i]
                i += 1
            else:
                arr[front + counter] = second_subarray[j]
                j += 1

            counter += 1

    def sort_element(self, arr, front, tail):
        if (front < tail):
            middle = int((front + tail) / 2)
            # Split the array into two parts
            self.sort_element(arr, front, middle)
            self.sort_element(arr, middle + 1, tail)
            # Combine split array into sorted way
            self.merge_elements(arr, front, tail, middle)






def main():
    obj = MySort()
    arr = lst_numeros
    size = len(arr)


    obj.sort_element(arr, 0, size - 1)

    obj.display(arr, size)



    q = PriorityQueue()
    q.put((lst_numeros[0], lst_nombres[0]))
    q.put((lst_numeros[1], lst_nombres[1]))
    q.put((lst_numeros[2], lst_nombres[2]))
    q.put((lst_numeros[3], lst_nombres[3]))
    q.put((lst_numeros[4], lst_nombres[4]))
    print(q.get())
    print(q.get())
    print(q.get())
    print(q.get())
    print(q.get())


if __name__ == "__main__": main()
