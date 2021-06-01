class Peli:
    def _init_(self, nombre, min, hr):
        self.nombre = nombre
        self.min = min
        self.hr = hr

    def _str_(self):
        return str.format("Nombre: {}, Min: {}, Horas: {}", self.nombre, self.min, self.hr)


def merge(array, left_index, right_index, middle, comparison_function):
    left_copy = array[left_index:middle + 1]
    right_copy = array[middle+1:right_index+1]

    left_copy_index = 0
    right_copy_index = 0
    sorted_index = left_index

    while left_copy_index < len(left_copy) and right_copy_index < len(right_copy):

      
        if comparison_function(left_copy[left_copy_index], right_copy[right_copy_index]):
            array[sorted_index] = left_copy[left_copy_index]
            left_copy_index = left_copy_index + 1
        else:
            array[sorted_index] = right_copy[right_copy_index]
            right_copy_index = right_copy_index + 1

        sorted_index = sorted_index + 1

    while left_copy_index < len(left_copy):
        array[sorted_index] = left_copy[left_copy_index]
        left_copy_index = left_copy_index + 1
        sorted_index = sorted_index + 1

    while right_copy_index < len(right_copy):
        array[sorted_index] = right_copy[right_copy_index]
        right_copy_index = right_copy_index + 1
        sorted_index = sorted_index + 1


def merge_sort(array, left_index, right_index, comparison_function):
    if left_index >= right_index:
        return

    middle = (left_index + right_index)//2
    merge_sort(array, left_index, middle, comparison_function)
    merge_sort(array, middle + 1, right_index, comparison_function)
    merge(array, left_index, right_index, middle, comparison_function)


movie1 = Peli("StarWars", 2,1)
movie2 = Peli("Alien", 1, 57)
movie3 = Peli("ASpaceOdyssey" ,2, 41)
movie4 = Peli("Matrix" ,2 ,30)
movie5 = Peli("BladeRunner" ,1 ,57)

array = [movie1, movie2, movie3, movie4]

merge_sort(array, 0, len(array) -1, lambda movieA, movieB: movieA.hr < movieB.hr)

print("peliculas ")
for movie in array:
    print(movie)

print()
merge_sort(array, 0, len(array) -1, lambda movieA, movieB: movieA.nombre < movieB.nombre)
print("movies ordenadas")
for movie in array:
    print(movie)