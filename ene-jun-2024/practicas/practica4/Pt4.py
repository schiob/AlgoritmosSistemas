def compare_cards(card1, card2):
    values = "A23456789TJQK"
    suits = "ECBD"
    
    value_order = {value: index for index, value in enumerate(values)}
    suit_order = {suit: index for index, suit in enumerate(suits)}
    
    value1, suit1 = card1
    value2, suit2 = card2
    
    if value_order[value1] != value_order[value2]:
        return value_order[value1] - value_order[value2]
    else:
        return suit_order[suit1] - suit_order[suit2]


def merge_sort(cards):
    if len(cards) <= 1:
        return cards
    
    mid = len(cards) // 2
    left = merge_sort(cards[:mid])
    right = merge_sort(cards[mid:])
    
    sorted_cards = []
    i = j = 0
    while i < len(left) and j < len(right):
        if compare_cards(left[i], right[j]) <= 0:
            sorted_cards.append(left[i])
            i += 1
        else:
            sorted_cards.append(right[j])
            j += 1
    
    sorted_cards.extend(left[i:])
    sorted_cards.extend(right[j:])
    
    return sorted_cards


def sort_hands(hands):
    sorted_hands = []
    for hand in hands:
        num_cards, *cards = hand
        sorted_hand = merge_sort(cards)
        sorted_hands.append((num_cards, *sorted_hand))
    return sorted_hands


# Lectura de la entrada
num_hands = int(input())
hands = []
for _ in range(num_hands):
    hand = input().split()
    hands.append((int(hand[0]), *hand[1:]))

# Ordenamiento de las manos
sorted_hands = sort_hands(hands)

# Impresión de las manos ordenadas
for hand in sorted_hands:
    print(' '.join(hand))