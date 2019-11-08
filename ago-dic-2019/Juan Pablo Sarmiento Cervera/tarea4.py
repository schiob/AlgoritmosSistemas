def check(string, l, r, flag):
	if l>r:
		return flag
	else:
		print(string[l],string[r])
		if string[l]==string[r]:
			flag=True
		else:
			return False
	return check(string,l+1,r-1,flag)

if __name__ == '__main__':
	string=input("Dame el nombre: ")
	if check(string,0,len(string)-1,False):
		print("El texto es palindromo")
	else:
		print("El texto no es palindromo!")