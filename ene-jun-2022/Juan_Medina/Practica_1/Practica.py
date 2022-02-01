from sqlite3 import enable_shared_cache
import sys

num1 = int(input("Ingrese el numero X: "))
num2 = int(input("Ingrese el numero Y: "))

if num1>-100:
    print("Numero de x valido")

if num2<100:
    print("Numero valido")


result = (num1+num2)
print(result)



