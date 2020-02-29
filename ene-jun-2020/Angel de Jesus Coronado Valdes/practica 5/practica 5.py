def compare(p1,p2):
	if p1[1] < p2[1]:
		return True
		pass
	elif p1[1] == p2[1]:
		#plata
		if p1[2] < p2[2]:
			return True
			pass
		elif p1[2] == p2[2]:
			#blonce
			if p1[3] < p2[3]:
				return True
				pass
			elif p1[3] == p2[3]:
				#nombre
				if p1[0] > p2[0]:
					return True
					pass
				elif p1[0] == p2[0]:
					return True
	return False

	pass

print("jugadores:")
n =int(input())

people =[]
for i in range(n):
	print("jugador y sus medallas")
	line = input().split()

	name =line[0]
	golde =int(line[1])
	silver =int(line[2])
	bronze =int(line[3])
	people.append([name,golde,silver,bronze])
	pass

for i in range(n):
	for j in range(n-i-1):
		if compare(people[j],people[j+1]):
			#people[j],people[j+1] = people[j+1],people[j]
			temp = people[j+1]
			people[j+1] = people[j]
			people[j] = temp
			pass
		pass
	pass


for i in range(n):
	print(people[i])
	pass
