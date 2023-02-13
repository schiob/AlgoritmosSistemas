import sys

stdin_fileno = sys.stdin
stdout_fileno = sys.stdout

listed = []

for line in stdin_fileno:

    listed.append(line.strip())

    if len(listed) > 0 and len(listed)-1  == int(listed[0]):

        #ordenar elementos por tamanio
        listed.pop(0)
        n = len(listed)
        for i in range(1, n):
            temp = listed[i]
            j = i - 1
            while j >= 0 and len(temp) < len(listed[j]):
                listed[j+1] = listed[j]
                j -= 1
            listed[j+1] = temp

        #recorrer elementos de arr para imprimir
        for elem in listed:
            # imprimir
            stdout_fileno.write(elem + '\n')

        #termina el programa
        exit(0)


