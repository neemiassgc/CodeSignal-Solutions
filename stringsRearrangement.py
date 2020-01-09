import itertools

def isDifferByOneChar(str1, str2):
	count = 0
	for i in range(len(str1)):
		if str1[i] != str2[i]:
			count += 1
	return count == 1

def stringsRearrangement(inputArray):
	possiblePermutations = itertools.permutations(inputArray)
	for per in possiblePermutations:
		allMatch = True
		for i in range(len(per) - 1):
			if not isDifferByOneChar(per[i], per[i + 1]):
				allMatch = False
				break
		if allMatch:
			return True
	return False