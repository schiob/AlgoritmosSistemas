import sys

stdin_fileno = sys.stdin
stdout_fileno = sys.stdout

listed = []

for line in stdin_fileno:
    # separar
    listed = (line.strip().split(' '))

    # castear a int
    intList = [eval(i) for i in listed]

    # ordenar en reversa
  
    for i in range(len(intList)):

        min_idx = i
        for j in range(i + 1, len(intList)):
            if intList[min_idx] < intList[j]:
                min_idx = j

   
        intList[i], intList[min_idx] = intList[min_idx], intList[i]

    for elem in intList:
        # imprimir
        stdout_fileno.write(str(elem) + ' ') 

    exit(0)
