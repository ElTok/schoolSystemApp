
package schoolsystemapp;



/**
 *
 * @author elTok
 */
public class Student {
    private String firstName;
    private String lastName;
    private String dob;
    private int tuitionFees;
    
            
    public Student(String firstName, String lastName, String dob, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", tuitionFees=" + tuitionFees + '}';
    }

    

   
   

   
    
   
}
   
    
  