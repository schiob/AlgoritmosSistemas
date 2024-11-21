#Ejercicio 1
rainbow_order = ["Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"]

color_priority = {color: index for index, color in enumerate(rainbow_order)}

n = int(input().strip())

markers = []
for _ in range(n):
    s = input().strip()
    color, level = s.split("-")
    level = int(level)  
    markers.append((color, level, s))  


markers.sort(key=lambda x: (color_priority[x[0]], x[1]))

for marker in markers:
    print(marker[2])


print("")
print("Ejercicio 2")
#Ejercicio 2
n = int(input().strip())
numbers = list(map(int, input().strip().split()))

max_value = max(numbers)

count = [0] * (max_value + 1)

for number in numbers:
    count[number] += 1

sorted_numbers = []
for value, freq in enumerate(count):
    sorted_numbers.extend([value] * freq)  

print(" ".join(map(str, sorted_numbers)))
