def searc_book(bshelf, book):
    position = -1
    for i in range(len(bshelf)):
        if bshelf[i] == book:
            position = i + 1
            break
    return position

def main():
     n, book = input().split()
     n = int(n)
     bshelf = input().split()
     
     position = searc_book(bshelf, book)
     print(position)

if __name__ == '__main__':
    main()