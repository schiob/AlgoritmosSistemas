def merge_sort(libros):
    if len(libros) <= 1:
        return libros
    #Divido la lista en dos mitades
    mid = len(libros) // 2
    left_half = merge_sort(libros[:mid])
    right_half = merge_sort(libros[mid:])
    #Combino las dos mitades 
    return merge(left_half, right_half)
def merge(left, right):
    sorted_books = []
    r = 0
    x = 0
    #Comparo
    while r < len(left) and x < len(right):
        if left[r][1] < right[x][1]:
            sorted_books.append(left[r])
            r += 1
        else:
            sorted_books.append(right[x])
            x += 1
    sorted_books.extend(left[r:])
    sorted_books.extend(right[x:])
    return sorted_books
def main():
    n = int(input())
    books = []
    for _ in range(n):
        line = input().split()
        title = " ".join(line[:-1])
        pages = int(line[-1])
        books.append((title, pages))
    #Ordena usando mergesort
    sorted_books = merge_sort(books)
    print(" ".join([book[0] for book in sorted_books]))
if __name__ == "__main__":
    main()