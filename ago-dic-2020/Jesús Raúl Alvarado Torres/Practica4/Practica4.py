def Palindormo(s):
    return s==s[::-1]

s = input()
P = Palindormo(s)
 
if P:
    print("si es")
else:
    print("no es")