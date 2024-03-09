def merge_sort(cards):
    if len(cards) <= 1:
        return cards
    
    mid = len(cards) // 2
    left_half = cards[:mid]
    right_half = cards[mid:]
    
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)
    
    return merge(left_half, right_half)

def merge(left, right):
    merged = []
    left_index = 0
    right_index = 0
    
    while left_index < len(left) and right_index < len(right):
        left_card = left[left_index]
        right_card = right[right_index]
        
        if card_value(left_card) < card_value(right_card) or \
           (card_value(left_card) == card_value(right_card) and card_suit(left_card) < card_suit(right_card)):
            merged.append(left_card)
            left_index += 1
        else:
            merged.append(right_card)
            right_index += 1
            
    while left_index < len(left):
        merged.append(left[left_index])
        left_index += 1
        
    while right_index < len(right):
        merged.append(right[right_index])
        right_index += 1
        
    return merged

def card_value(card):
    values = {'A': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9, 'T': 10, 'J': 11, 'Q': 12, 'K': 13}
    return values[card[0]]

def card_suit(card):
    return card[1]

def sort_hands(hands):
    sorted_hands = []
    for hand in hands:
        cards = hand.split()
        sorted_cards = merge_sort(cards)
        sorted_hands.append(' '.join(sorted_cards))
    return sorted_hands

H = int(input())
hands = []
for _ in range(H):
    hand = input().split(maxsplit=1)[1]  
    hands.append(hand)

sorted_hands = sort_hands(hands)

for sorted_hand in sorted_hands:
    print(sorted_hand)
