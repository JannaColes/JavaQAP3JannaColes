package Problem1;

// CollegeStudent class represents a college student with additional properties like major and year.
class CollegeStudent extends Student {
  private String major; // Student's major
  private int year; // Student's current year in college


/**
 * 
 * @param name  The name of the college student.
 * @param age  The age of the college student.
 * @param gender  The gender of the college student.
 * @param idNum  The ID number of the college student.
 * @param gpa  The GPA of the college student. 
 * @param year  The currents year of the college student.
 * @param major  The major of the college student.
 */  

  public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
    super(name, age, gender, idNum, gpa);
    this.year = year;
    this.major = major;
  }


/**
 * Getter method for the college student's major.
 * 
 * @return the major of the college student.
 */  
  public String getMajor() {
    return major;
  }



/**
 * Getter method for the college student's current year.
 * 
 * @return the current year of the college student.
 */
  public int getYear() {
    return year;
  }


/**
 * Setter method for the college student's major.
 * @param major The new major of the college student.
 */  
  public void setMajor(String major) {
    this.major = major;
  }


/**
 * Setter method for the college student's current year.
 * 
 * @param year the new current year of the college student.
 */  
  public void setYear(int year) {
    this.year = year;
  }


/**
 * Returns a string representation of the college student.
 * 
 * @return A string representation of the college student.
 */
  public String toString() {
    return super.toString() + ", year: " + year + ", major: " + major;
  }


}