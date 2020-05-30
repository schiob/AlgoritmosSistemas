print("ingresa los numeros que quieres sumar")
str1 = input().split(" ")
print(str1)

str2 = [int(x) for x in str1 ]

print(str2)
suma = 0

for i in range(0,len(str2)):
	suma+=int(str2[i])
	pass
print(suma)