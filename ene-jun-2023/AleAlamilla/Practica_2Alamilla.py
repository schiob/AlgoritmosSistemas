numbers = input("Enter the numbers: ")
numbers_list = numbers.split()
numbers_list = [int(x) for x in numbers_list]
evenlist = []

print(numbers_list)

def even_numbers (list):    
    for list in list:
        if list % 2 == 0:
            evenlist.append(list)
    return evenlist

def sortHtoL(numbers):
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            if numbers[i] < numbers[j]:
                numbers[i], numbers[j] = numbers[j], numbers[i]
    return numbers

even_numbers(numbers_list);
sortHtoL(evenlist);
print (evenlist)