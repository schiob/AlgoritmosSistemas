def linear_search(k,y):
    for i in range(len(k)):
        if k[i]==y:
            return i
    return -1


s = input().split()
k = int(s[0])
x = str(s[1])

k = list(map(str, input("").split()))

result = linear_search(k,x)
if result==-1:
     print("-1")
else:
     print(" %d"  %(result))