# method 1
def random(i):

    num = 99
    if (i > num):
        temp = i
        i = num
        num = temp
    else:
        i = 0
        num = 100
        
    return i
    
# method 2
def mystery1(n):
    """

    """

    s = 0
    i = 2
    while (i <= n):
        s += i
        i = i + 2

    return s

# method 3
def mystery2(n):
    """
    """

    s = 0
    for i in range(1, n, 2):
        s += i

    return s

print(random(5))
print(mystery2(8))
