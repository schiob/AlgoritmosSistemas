def main():
    print("Please Enter The Number Of Pokemons To Add:")
    n = int(input())  
    print("Please Enter The Strength of the Pokemons separete by a space:")
    pokemons = list(map(int, input().split()))  

    for i in range(n):
        for j in range(n-i-1):
            if pokemons[j] < pokemons[j+1]:
                pokemons[j], pokemons[j+1] = pokemons[j+1], pokemons[j]

    print("The Pokemons from Strongest to Weakest: ")
    print(' '.join(map(str, pokemons)))

if __name__ == '__main__':
    main()
