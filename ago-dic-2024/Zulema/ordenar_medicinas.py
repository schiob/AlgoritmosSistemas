def insertion_sort(medicinas):
    
    for i in range(1, len(medicinas)):
        key = medicinas[i]
        j = i - 1

        while j >= 0 and key[1] > medicinas[j][1]:
            medicinas[j + 1] = medicinas[j]
            j -= 1
        medicinas[j + 1] = key


if __name__ == "__main__":
    n = int(input(""))
    medicinas_data = input("").split()

    
    medicinas = []
    for i in range(n):
        name = medicinas_data[2 * i]
        count = int(medicinas_data[2 * i + 1])
        medicinas.append((name, count))

    
    insertion_sort(medicinas)

    
    sorted_names = [med[0] for med in medicinas]

    
    print(" ".join(sorted_names))
