
package schoolsystemapp;

import java.util.ArrayList;

/**
 *
 * @author elTok
 */
public class AssignmentsPerStudent  {
    
    private Student s;
    private ArrayList<Assignment>assignments;

    public AssignmentsPerStudent(Student s, ArrayList<Assignment> assignments) {
        this.s = s;
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "AssignmentsPerStudent{" + "s=" + s + ", assignments=" + assignments + '}';
    }
     
     
     
     
}



    
    

