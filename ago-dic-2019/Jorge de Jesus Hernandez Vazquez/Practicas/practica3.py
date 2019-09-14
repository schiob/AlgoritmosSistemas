L = list(map(str, input("Manuel,dame los nombres porfa: ").split()))
for p in sorted(L, key=len):
    print(p, end=" ")
