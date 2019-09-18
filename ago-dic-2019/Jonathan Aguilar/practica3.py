a=list(input("Dame la ista con los nombres de dinosaurios: ").split())
for F in range (1, len(a)):
	z= a[F]
	j= F-1
	while j>=0 and len(z)<len(a[j]):
		a[j+1]=a[j]
		j=j-1
	a[j+1]=z

print(" ".join(a))