def bubble_sort(names):
    n = len(names)
    for i in range(n):
        for j in range(n-i-1):
            if len(names[j]) < len(names[j+1]):
                names[j], names[j+1] = names[j+1], names[j]
    return names

def main():

    print("Please enter the dinos name to sort: ")
    dinos = input().split()
    
    order_list = bubble_sort(dinos)

    print("The dinos name from longest to shortest: ")
    for name in order_list:
        print(name,end=" ")

if __name__ == '__main__':
    main()
