def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n-1)

def factorial_iter(n):
    total = 1
    for x in range(1, n+1):
        total *= x
    
    return total

def fib(n):
    if n == 0 or n == 1:
        return 1
    return fib(n-1) + fib(n-2)

def fib_iter(n):
    anterior = 1
    nuevo = 1
    for _ in range(n-1):
        temp = nuevo
        nuevo = anterior + nuevo
        anterior = temp
    
    return nuevo


if __name__ == "__main__":
    print(fib(5))
    print(fib_iter(5))