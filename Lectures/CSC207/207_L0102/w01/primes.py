def isPrime(n):
	if n<2:
		return False
	else:
		for i in range(2,n):
			if n%i==0:
				return False
		return True

def primes(n):
	current = 2
	list_of_primes = []
	while len(list_of_primes)<n:
		if isPrime(current):
			list_of_primes.append(current)
		current = current + 1
	return list_of_primes

'''
for i in range(100):
	print(i,str(isPrime(i)))
'''

print(primes(10000)[9999])
