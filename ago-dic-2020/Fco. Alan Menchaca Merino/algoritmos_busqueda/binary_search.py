class BinarySearch:

    @staticmethod
    def binarySearch(array, start, end, value):
        middle = (start + end) // 2

        if value == array[middle]:
            return array[middle]

        if start == end:
            return -1

        if value < array[middle]:
            return BinarySearch.binarySearch(array, start, middle - 1, value)
        else:
            return BinarySearch.binarySearch(array, middle + 1, end, value)
