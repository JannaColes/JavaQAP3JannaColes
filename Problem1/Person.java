package Problem1;

// Person class represents a basic person with a name, age and gender.
class Person {
    protected String myName;  // Name of the person
    protected int myAge;  // Person's age
    protected String myGender;  // M or F for male of female

    
    /** Constructor to initialize a Person Object

    * @param name The name of the person.
    
    * @param age  The age of the person.

    * @param gender  The gender of the person.
    
    */
    

  public Person(String name, int age, String gender) {
      myName = name;
      myAge = age;
      myGender = gender;
    }

    
    /** Getter method for the person's name
     * @return The person's name
     */
  public String getName() {
    return myName;
}

/**
  * Getter method for the person's age.
  * @return The age of the person
  */
  public int getAge() {
    return myAge;
  }


/**
 * Getter method for the person's gender.
 * @return The gender of the person.
 */
  public String getGender() {
    return myGender;
  }


/**
 * Setter method for the person's name
 * @param name The new name of the person.
 */
  public void setName(String name) {
    myName = name;
  }

  
/** Setter method for the person's age.
 *
 * @param age the New age of the person.
 */
  public void setAge(int age) {
    myAge = age;
  }

/**
 * Setter method for the person's gender.
 * @param gender the new gender of the person.
  */
  public void setGender(String gender) {
    myGender = gender;
  }

/**
 * Returns a string representation of the person.
 *
 * @return A string representation of the person.
 */

  public String toString() {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }
}