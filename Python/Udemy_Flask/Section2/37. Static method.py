class ClassTest:
    def instance_method(self): # auto pass instance when I call this
        print(f"Called instance_method of {self}")
    @classmethod
    def class_method(cls): # auto pass class ClassTest when I call this
        print(f"Called class_method of {cls}")

    @staticmethod
    def static_method():  # pass nothing when I call this
        print("Called static method.")

class Book:
    TYPES = ("hardcover", "papaerback")
    def __init__(self, name, book_type, weight):
        self.name = name
        self.book_type = book_type
        self.weight = weight

    def __repr__(self):
        return f"<Book {self.name}, {self.book_type}, weighing {self.weight}>"

    @classmethod
    def hardcover(cls, name, page_weight):
        # use classmethod to create instance
        return cls(name, cls.TYPES[0], page_weight + 100)

    @classmethod
    def paperback(cls, name, page_weight):
        return cls(name, cls.TYPES[1], page_weight)

# ClassTest.class_method()
# ClassTest.static_method()
# print(Book.TYPES)
book = Book.hardcover("Harry Potter", 1500)
print(book)