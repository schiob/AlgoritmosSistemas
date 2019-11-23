import random
# deck = ["2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AC", "2D", "3D", "4D", "5D", "6D",
#        "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AD", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH",
#        "QH", "KH", "AH", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", "AS"]
from functools import total_ordering
graveyard = []
class Card(object):
    def __init__(self, rank, suit):
        self.rank = rank
        self.suit = suit
    def __str__(self):
        return '%s%s' % (self.rank,
                             self.suit)
    def __repr__(self): return str(self)
    def __lt__(self, other):
        t1 = self.suit, self.rank
        t2 = other.suit, other.rank
        return t1 < t2
    def __gt__(self, other):
        t1 = self.suit, self.rank
        t2 = other.suit, other.rank
        return t1 > t2
    def __eq__(self, other):
        t1 = self.suit, self.rank
        t2 = other.suit, other.rank
        return t1 == t2
class Deck(object):
    def __init__(self):
        self.rank = ['Ace','2', '3', '4', '5', '6', '7', '8', '9', 'T', 'Jack', 'Queen', 'King']
        self.suit = ['C', 'D', 'H', 'S']
        self.deck = [Card(r, s) for r in self.rank for s in self.suit]
        random.shuffle(self.deck)
    def __getitem__(self, item):
        return self.deck[item]

    def deal(self):
        """
        Devuelve una carta del mazo
        :return:
        """
        topCard = self.deck.pop(0)
        graveyard.append(topCard)
        print(topCard)

    def shuffle(self):
        """Baraja el mazo
        :return:
        """
        self.deck.extend(graveyard)
        random.shuffle(self.deck)
        self.fan()

    def fan(self):
        """Imprime la baraja
        :return:
        """
        for card in self.deck:
            print(card)

    def order(self):
        return self.deck.sort()

    def printGraveyard(self):
        for dead in graveyard:
            print(dead)
d = Deck()

d.order()

d.fan()