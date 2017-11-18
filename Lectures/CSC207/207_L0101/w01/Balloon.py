class Balloon:

    def __init__(self, color):
        self.amount = 0
        self.capacity = 100
        self.popped = False
        self.color = color

    def getAmount(self):
        return self.amount

    def getCapacity(self):
        return self.capacity

    def getIsPopped(self):
        return self.popped

    def pop(self):
        '''Set amount and capacity to 0, and popped to True.'''
        self.amount = 0
        self.capacity = 0
        self.popped = True



        

    def inflate(self, a):
        '''If balloon is not popped, and a is a positive int, add
 given int a to amount, as long as total does not exceed capacity. If total
 is larger than capacity, pop balloon.'''
        
        if not self.popped and a > 0:
            self.amount = self.amount + a;
            if self.amount > self.capacity:
                self.pop()



    def __str__(self):
        s = "Amount: " + str(self.amount) + ", Capacity: " + str(self.capacity) + ", Popped: " + str(self.popped)
        return s
