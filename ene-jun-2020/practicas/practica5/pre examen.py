class Participant():
    def __init__(self,name,gold,silver,bronze):
        self.name=name
        self.gold=gold
        self.silver=silver
        self.bronce=bronze

    def compareTo(self,p2):
        # primero Oro
        if self.gold > p2.gold:
            return True
        elif self.gold == p2.gold:
            #plata
            if self.silver > p2.silver:
                return True
            elif self.silver == p2.silver:
                #bronce
                if self.bronce > p2.bronce:
                    return True
                elif self.bronce == p2.bronce:
                        #nombre
                        if self.name < p2.name:
                            return True
                        elif self.name == p2.name:
                                return True
        return False

def main():
    n=int(input())
    people =[]
    for _ in range(n):
        line = input().split()

        name = line[0]
        gold = line[1]
        silver = line[2]
        bronze = line[3]

        newobj = Participant(name,gold,silver,bronze)
        people.append(newobj)
#bubble
    for i in range(n):
        for j in range(n-i-1):
            if not people[j].compareTo(people[j+1]):
                people[j], people[j+1] = people[j+1], people[j]
    for p in people:
        print(p.name)

if __name__ == "__main__":
    main()