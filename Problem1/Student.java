package Problem1;

// Student class represents a student with additional properties like student ID and GPA.
class Student extends Person {
  protected String myIdNum; //Student ID number
  protected double myGPA; //Grade Point Average


/**
 * Constructor to initialize a Student object.
 * @param name  The name of the student.
 * @param age  The age of the student.
 * @param gender  The gender of the student.
 * @param idNum  The ID number of the student.
 * @param gpa  The GPA of the student.
 */

  public Student(String name, int age, String gender, String idNum, double gpa) {
    super(name, age, gender);
    myIdNum = idNum;
    myGPA = gpa;
  }


/**
 * Getter method for the student's ID number
 *
 * @return The ID number of the student.
  */

  public String getIdNum() {
    return myIdNum;
  }

/** Getter method for the Student's GPA.
 *
 * @return The GPA of the student.
 */

  public double getGPA() {
    return myGPA;
  }


/**
 * Setter method for the student's ID number.
 * 
 * @param idNum The new ID number of the student.
 */

  public void setIdNum(String idNum) {
    myIdNum = idNum;
  }


/**
 * Setter method for the Student's GPA.
 *
 * @param gpa The new GPA of the student.
 */
  public void setGPA(double gpa) {
    myGPA = gpa;
  }
  

/**
 * Returns a string representation of the student.
 *
 * @return A string representation of the student.
 */

 public String toString() {   return super.toString() + ", student ID: " + myIdNum + ", GPA: " + myGPA;
 }
}
