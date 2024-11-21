def insertion_sort(medicamentos):
    
    for i in range(1, len(medicamentos)):
        key = medicamentos[i]
        j = i - 1
        
        while j >= 0 and key < medicamentos[j]:
            medicamentos[j + 1] = medicamentos[j]
            j -= 1
        medicamentos[j + 1] = key

def main():
    n = int(input(""))  
    medicamentos = input("").split() 

    insertion_sort(medicamentos)

    print(" ".join(medicamentos))

if __name__ == "__main__":
    main()
