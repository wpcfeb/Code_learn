class Student:
    def __init__(self, name, grades):
        self.name = name
        self.grades = grades

    def average_grade(self):
        return sum(self.grades) / len(self.grades)

student = Student("Bob", (90, 100, 90, 90))
student2 = Student("Rolf", (90, 45, 90, 90))
print(student.name)
print(student.grades)
print(Student.average_grade(student2))
print(student2.average_grade())