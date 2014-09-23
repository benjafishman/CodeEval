################################
# Ben Fishman 9/23/2014
# CodeEval Question: Self Describing Numbers
#
# Essentially make a dictionary of the values of the input string and their frequency
# Then run over string again and check two cases
#	1. if the index of the input is not a key in the dictionary then its value must be 0
#	2. if the index is a key in the dictionary the val[index] must equal the frequency of that index in the dictionary
# 
i = input("Input num: ")


def self_describing(val):
	d = {}
	for x in val:
		if x in d:
			d[x] = d[x]+1
		else:
			d[x] = 1
	print("d:",d)
	for x in range(len(val)):
		if str(x) not in d and int(val[x])!=0:
			return 0
		elif x in d:
			if int(val[x])!=d[x]:
				return 0
	return 1
print(self_describing(i))