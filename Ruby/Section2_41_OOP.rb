class Student
  @first_name
  @last_name

  def first_name=(name)
    @first_name = name
  end
  
  def first_name # getter
    @first_name
  end


  def to_s
    "First name: #{@first_name}"
  end
end

peace = Student.new
puts peace

peace.first_name = "Peace" #a.b  b is a method
puts peace.first_name