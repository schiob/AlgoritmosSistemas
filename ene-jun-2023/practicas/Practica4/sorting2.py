import sys

stdin_fileno = sys.stdin
stdout_fileno = sys.stdout

listed = []

for line in stdin_fileno:
    #separar
    listed = (line.strip().split(' '))

    #castear a int
    intList = [eval(i) for i in listed]

    #ordenar en reversa
    intList.sort(reverse=True)

    for elem in intList:
        # imprimir
        stdout_fileno.write(str(elem) + ' ' )
        
    exit(0)


