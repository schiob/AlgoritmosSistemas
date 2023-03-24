def merge_sort(cards):
    if len(cards) <= 1:
        return cards
    
    mid = len(cards) // 2
    left = cards[:mid]
    right = cards[mid:]
    
    left_sorted = merge_sort(left)
    right_sorted = merge_sort(right)
    
    return merge(left_sorted, right_sorted)

def merge(left, right):
    result = []
    i = j = 0
    
    while i < len(left) and j < len(right):
        if get_card_value(left[i]) < get_card_value(right[j]):
            result.append(left[i])
            i += 1
        elif get_card_value(left[i]) > get_card_value(right[j]):
            result.append(right[j])
            j += 1
        else:
            if get_card_suit(left[i]) < get_card_suit(right[j]):
                result.append(left[i])
                i += 1
            else:
                result.append(right[j])
                j += 1
    
    result += left[i:]
    result += right[j:]
    
    return result

def get_card_value(card):
    value = card[0]
    if value == 'A':
        return 1
    elif value == 'T':
        return 10
    elif value == 'J':
        return 11
    elif value == 'Q':
        return 12
    elif value == 'K':
        return 13
    else:
        return int(value)

def get_card_suit(card):
    return card[1]


def main():
  n = int(input())

  for i in range(n):
      hand = input().split()[1:]
      sorted_hand = merge_sort(hand)
      print(' '.join(sorted_hand))


if __name__ == '__main__':
    main()
