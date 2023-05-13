def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left = arr[:mid]
    right = arr[mid:]
    
    left = merge_sort(left)
    right = merge_sort(right)
    
    return merge(left, right)
    
def merge(left, right):
    result = []
    i = 0
    j = 0
    
    while i < len(left) and j < len(right):
        if left[i][0] < right[j][0]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    
    result += left[i:]
    result += right[j:]
    
    return result
    
# lectura de la entrada
n = int(input())
hands = []

for i in range(n):
    hand = input().split()[1:]
    hand = [(card[:-1], card[-1]) for card in hand]
    hands.append(hand)

# ordenamiento de las manos
sorted_hands = [merge_sort(hand) for hand in hands]

# impresión de las manos ordenadas
for hand in sorted_hands:
    for card in hand:
        print(card[0] + card[1], end=' ')
    print()