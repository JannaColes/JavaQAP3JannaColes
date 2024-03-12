package Problem1;

// Teacher class represents a teacher with additional properties like salary and subject.
class Teacher extends Person {
  private String subject; //Subject taught by the teacher
  private double salary; // The teacher's salary


/** 
 * Constructor to initialize a Teacher object.
 * 
 * @param name  The name of the teacher.
 * @param age  The age of the teacher.
 * @param gender  The gender of the teacher.
 * @param subject  The subject taught by the teacher.
 * @param salary  The salary of the teacher.
 */
  public Teacher(String name, int age, String gender, String subject, double salary) {
    super(name, age, gender);
    this.subject = subject;
    this.salary = salary;
  }


/**
 * Getter method fot the teacher's subject.
 * 
 * @return The subject taught by the teacher.
 */
  public String getSubject() {
    return subject;
  }


/**
 * Getter method for the teacher's salary.
 * 
 * @return The salary of the teacher.
 */  
  public double getSalary() {
    return salary;
  }


/**
 * Setter method for the teacher's subject.
 * 
 * @param subject The new subject taught by the teacher.
 */  
  public void setSubject(String subject) {
    this.subject = subject;
  }


/** 
 * Setter method for the teacher's salary.
 * 
 * @param salary The new salary of the teacher.
 *  */  
  public void setSalary(double salary) {
    this.salary = salary;
  }


/**
 * Returns a string representation of the teacher.
 * 
 * @return A string representation of the teacher.
 */  
  public String toString() {
    return super.toString() + ", subject: " + subject + ", salary: " + salary;
  }
  
}
