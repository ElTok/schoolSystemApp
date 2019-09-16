
package schoolsystemapp;

import java.util.ArrayList;

/**
 *
 * @author elTok
 */
public class AssignmentsPerCourse {
   private Course c;
   private ArrayList<Assignment>assignments;

    public AssignmentsPerCourse(Course c, ArrayList<Assignment> assignments) {
        this.c = c;
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + "c=" + c + ", assignments=" + assignments + '}';
    }
    
    
}
