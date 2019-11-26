a,b = input().split()
arr11 = []
for i in range(int(a)):
        x = input().split()
        arr11.append(x)
count=0
for j in range(int(a)):
    if arr11[j][0]==b:
         
         print(count)
    else:
        count=count+1