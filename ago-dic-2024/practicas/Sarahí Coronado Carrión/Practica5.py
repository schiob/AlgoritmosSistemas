def merge_sort_books(books):
    if len(books) > 1:
        mid = len(books) // 2 
        left_half = books[:mid]  # Se divide la primera parte
        right_half = books[mid:]  # Se divide la segunda mitad
        merge_sort_books(left_half)
        merge_sort_books(right_half)

        i = j = k = 0
        while i < len(left_half) and j < len(right_half):
            if left_half[i][1] < right_half[j][1]:
                books[k] = left_half[i]
                i += 1
            else:
                books[k] = right_half[j]
                j += 1
            k += 1
            
        while i < len(left_half):
            books[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            books[k] = right_half[j]
            j += 1
            k += 1

def main():
    n = int(input().strip())
    books = []
    for _ in range(n):
        data = input().strip().split()
        title = " ".join(data[:-1])  
        pages = int(data[-1])  
        books.append((title, pages))
        
    merge_sort_books(books)
    
    sorted_titles = [book[0] for book in books]
    print(" ".join(sorted_titles))
if __name__ == "__main__":
    main()
