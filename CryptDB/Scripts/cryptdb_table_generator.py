from random import randint

filename = "table_name.txt"
rows = 10
columns = 5
table_file = open(filename, "wb")

for i in range(rows):
	for j in range(columns):
		table_file.write(str(randint(1,1000))+' ')
	table_file.write('\n')
	
table_file.close()
	