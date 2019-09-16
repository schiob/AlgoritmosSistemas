a=list(input("Dame la ista con los nombres de dinosaurios: ").split())
for p in sorted(a, key=len):
	print(p , end=", ")