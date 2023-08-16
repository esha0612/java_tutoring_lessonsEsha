# A simple example of operator overriding

class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    # Overriding the __add__ operator
    def __add__(self, other):
        x = self.x + other.x
        y = self.y + other.y
        return Point(x,y)

    # Overriding the __str__ operator
    def __str__(self):
        return "({0},{1})".format(self.x, self.y)
    
if __name__ == "__main__":
    p1 = Point(2,3)
    p2 = Point(-1,2)
    print(p1)
    print(p2)
    print(p1+p2)