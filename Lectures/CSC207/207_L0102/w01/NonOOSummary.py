		
print("Hello ",)
print("World!")

# python lots of types, but don't have to declare variables of a particular type

d=9991991.2344
# d = "This" # cant do this in Java
f=float(3222.45)
l=-99991919 # integers can be as big as we like not restricted like Java
i=8236
num_IndexCounter=-17
s=-32767
b=-7
# // IS-A reads up the above list

c='T' # 
bo=False  

'''
Assignment statements, expressions
* Converting, casting
*
* Expression evaluated left to right, each sub-expression
*	converted AS NECESSARY. Think of = as an operator!
* Converting done automatically up the list 
* 	x to y if x IS-A y, if no info lost
* Casting required to move down the list
'''

d=i
f=b
b=d 
i=23+19*2
c=b
d=3.14159*12*12;

d=(1//2)+float(1/2)+1//2+(1/2.0)
print(d)
i=int((1.0/2)+(float(1/2)))
print(i)

# Strings (not primitive)
s0="Hey There!"
s1=None
s2=""
s0="i="+str(i)+" and d="+str(d)
s0=s0+" and b="+str(b)
print("In total "+s0)
print("s0.length="+str(len(s0)))
# print("s1.length="+str(len(s1)))
print("s2.length="+str(len(s2)))

'''
/* Operations which return a boolean (true/false)
* i==j i<j i<=j i>j i>=j i!=j
* Operations on booleans  NOT AND OR
*/ 
'''

bo1 = None
bo2=(99<d)
bo1=True
bo=(not(12>23))or(bo1 and bo2 and True)
print("bo1="+str(bo1)+" bo2="+str(bo2)+" d="+str(d)+" bo="+str(bo))
# That is, b=(not(false))or(true and false and true)) which is 
# (true or false) which is true

# NOTE: In python indentation matters!!!
# if-statement
n=17
if i>n:
	temp=i  # BLOCK
	i=n
	n=temp
else:
	i=0 # BLOCK
	n=100 

# Method definition, no return type, parameters with no types, local variables
# additional parameters comma separated
def sum_fun(n):
	# while and break
	x=0
	i=2
	while (i<=n): # sum=2+...+i-1
		x=x+i
		i=i+1
	n=0; #  Won't affect argument!
	return(x) # evaluate, assign back, return control

# for-loop
def sum2(n):
	sum=0
	for i in range(2,n+1,1):
		sum=sum+i
	return(sum)

# Recursion
# Returns i!=i*(i-1)*...*2*1
def factorial(i):
	retVal=1
	if i==0:
		retVal=1
	else:
		retVal=i*factorial(i-1)
	return(retVal)

# method calls, arguments, pass by VALUE
print("i="+str(i)+" n="+str(n))
i=sum_fun(n) # NOTE: n unchanged
print("i="+str(i)+" n="+str(n))

# NOTE: In python indentation matters!!!
# if, while, for-loops 
# 	if BLOCK has 1 statement, can include it immediately after

# Recursion, stack
n=10
n=factorial(n)
print(str(n))
# n=factorial(-3)

