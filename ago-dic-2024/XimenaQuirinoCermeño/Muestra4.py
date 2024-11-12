colores = {
    "Rojo": 0,
    "Anaranjado": 1,
    "Indigo": 2
}
def particion(pl, l, h):
    pivot = pl[h]
    r = l -1
    for j in range(l, h):
        colorj, d = pl[j]
        c_pivot, d_pivot = pivot
        if (colores[colorj], d) < (colores[c_pivot], d_pivot):
            r +=1
            pl[r], pl[j] = pl[j], pl[r]
    pl[r +1], pl[h] = pl[h], pl[r +1]
    return r +1
def quicksort(pl, l, h):
    if l < h:
        pi = particion(pl, l, h)
        quicksort(pl, l, pi -1)
        quicksort(pl, pi +1, h)
def ord(pl):
    pd_pl = []
    for plumon in pl:
        co, di = plumon.split('-')
        pd_pl.append((co, int(di)))
    #Quick Sort
    quicksort(pd_pl, 0, len(pd_pl) - 1)
    return [f"{co}-{di}" for co, di in pd_pl]
n = int(input("Número de plumones: "))
pl = [input() for _ in range(n)]
resultado = ord(pl)
for plumon in resultado:
    print(plumon)