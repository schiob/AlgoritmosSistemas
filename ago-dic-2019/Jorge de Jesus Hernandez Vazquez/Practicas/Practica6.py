H = int(input())
for i in range(H):
    di = {"A":1, "T":10, "J":11, "Q":12, "K":13, "2":2, "3":3, "4":4, "5":5, "6":6, "7":7, "8":8, "9":9}
    di2 = {"S":1, "H":2, "C":3, "D":4}
    N = input().split()
    cards=N[1:]
    for i in range(len(cards)):
        indxmin = i
        for j in range(i+1, len(cards)):
            a, b = cards[j], cards[indxmin]
            if di[a[0]] < di[b[0]]:
                indxmin = j
                
            if di[a[0]] == di[b[0]]:
                if di2[a[1]] < di2[b[1]]:
                    indxmin = j
           
        cards[indxmin], cards[i]  = cards[i], cards[indxmin]
    print(' '.join(cards))



