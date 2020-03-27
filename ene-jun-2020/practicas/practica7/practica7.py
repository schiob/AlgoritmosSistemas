c = int(input())
arr=[]
for c in input().split(" "):
    r=int(c)
    arr.append(r)
def shellSort(alist):
    sublistcount = len(alist)//2
    while sublistcount > 0:
      for start_position in range(sublistcount):
        gap_InsertionSort(alist, start_position, sublistcount)
      sublistcount = sublistcount // 2

def gap_InsertionSort(nlist,start,gap):
    for i in range(start+gap,len(nlist),gap):
        current_value = nlist[i]
        position = i
        while position>=gap and nlist[position-gap]>current_value:
            nlist[position]=nlist[position-gap]
            position = position-gap
        nlist[position]=current_value
nlist=arr
shellSort(nlist)
for i in arr:
    print(i,end=" ")