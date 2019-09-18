a=[]
p=int(input("Dame la cantidad de problemas: "))
m=int(input("Dame los minutos disponibles que tienes:" ))
for F in range (b):
	u=int(input())
	a.append(u)	
for F in range (1, len(a)):
	z= a[F]
	j= F-1
	while j>=0 and z<a[j]:
		a[j+1]=a[j]
		j=j-1
	a[j+1]=z
count=0

for F in range(b):
	if R>=a[F] and R>=0:
		count=count+1
		R=R-a[F]
print("cuantos problemas puede hacer: ", count)