def merge_sort(libros):
    if len(libros) > 1:
<<<<<<< HEAD
=======

>>>>>>> 88c5fc63042c95d5c09e2842f5feb05cb084c5c5
        mid = len(libros) // 2
        left_half = libros[:mid]
        right_half = libros[mid:]

        merge_sort(left_half)
        merge_sort(right_half)

        i = j = k = 0

        while i < len(left_half) and j < len(right_half):
            if left_half[i][1] < right_half[j][1]:
                libros[k] = left_half[i]
                i += 1
            else:
                libros[k] = right_half[j]
                j += 1
            k += 1

<<<<<<< HEAD
        
=======
>>>>>>> 88c5fc63042c95d5c09e2842f5feb05cb084c5c5
        while i < len(left_half):
            libros[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            libros[k] = right_half[j]
            j += 1
            k += 1

<<<<<<< HEAD

n = int(input())  
libros = []


=======
n = int(input())  
libros = []

>>>>>>> 88c5fc63042c95d5c09e2842f5feb05cb084c5c5
for _ in range(n):
    entrada = input().split()
    nombre_libro = entrada[0]
    paginas = int(entrada[1])
    libros.append((nombre_libro, paginas))

<<<<<<< HEAD

merge_sort(libros)


=======
merge_sort(libros)

>>>>>>> 88c5fc63042c95d5c09e2842f5feb05cb084c5c5
print(" ".join([libro[0] for libro in libros]))
