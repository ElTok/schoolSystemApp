
package schoolsystemapp;

import java.util.ArrayList;

/**
 *
 * @author elTok
 */
public class TrainersPerCourse {
    
    private Course c;
    private ArrayList<Trainer>trainers;

    public TrainersPerCourse(Course c, ArrayList<Trainer> trainers) {
        this.c = c;
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "c=" + c + ", trainers=" + trainers + '}';
    }
    
    
    
    
    
    
}
