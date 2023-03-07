import sys

stdin_fileno = sys.stdin
stdout_fileno = sys.stdout

listed = []

for line in stdin_fileno:

    listed = line.strip().split(' ')
    
    for i in range(len(listed)):
        for j in range(i+1, len(listed)):
            if len(listed[i]) < len(listed[j]):
                listed[i], listed[j] = listed[j], listed[i]

    #recorrer elementos de arr para imprimir
    for elem in listed:
        # imprimir
        stdout_fileno.write(elem + ' ')

    #termina el programa
    exit(0)


