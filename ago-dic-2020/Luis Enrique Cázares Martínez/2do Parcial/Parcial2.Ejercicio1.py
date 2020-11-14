def busquedaSecuencial(unaLista, item):
	pos = 0
	encontrado = False

	while pos < len(unaLista) and not encontrado:
	    if unaLista[pos] == item:
	        encontrado = pos
	    else:
	        pos = pos+1

	return encontrado



n = input("Dime el numero de libros de la repisa de mate y el nombre del libro que buscas separado por un espacio-> ")
n = n.split(" ")
nombres = input("Dime los nombres de los libros de mate separados por un espacio -> ")
nombres = nombres.split(" ")
print(busquedaSecuencial(nombres, n[1]))
