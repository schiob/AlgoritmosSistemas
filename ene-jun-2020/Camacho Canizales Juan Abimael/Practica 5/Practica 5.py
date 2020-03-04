class participant():
    def __init__(self, name, gold, silver, copper):
        self.name=name
        self.gold=gold
        self.silver=silver
        self.copper=copper

    def compareTO(self, p2):
        #oro
        if self.gold>p2.gold:
            return True
        elif self.gold == p2.gold:
                #plata
                if self.silver>p2.silver:
                    return True
                elif self.silver == p2.silver:
                    #copper
                        if self.copper>p2.copper:
                            return True
                        elif self.copper == p2.copper:
                            #nombre
                                if self.name<p2.name:
                                    return True
                                elif self.name == p2.name:
                                    return True
        return False

def main():
    n = int(input("Numero de competidores:\n "))
    gente=[]
    for _ in range(n):
        line=input().split()

        name=line[0]
        gold=int(line[1])
        silver=int(line[2])
        copper=int(line[3])

        gente.append(participant(name, gold, silver, copper))

    for i in range (n):
        for j in range(n-i-1):
            if not gente[j].compareTO(gente[j+1]):
                gente[j], gente[j+1] = gente[j+1], gente[j]

    for p in gente:
        print(p.name)

if __name__ == "__main__":
    main()