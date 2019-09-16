
package schoolsystemapp;

/**
 *
 * @author elTok
 */
public class Assignment {
    private String title;
    private String description;
    private String dsubmission;
    private String tSubmission;
    private int oralMark;
    private int totalMark;

    public Assignment(String title, String description, String dsubmission, String tSubmission, int oralMark, int totalMark) {
        this.title = title;
        this.description = description;
        this.dsubmission = dsubmission;
        this.tSubmission = tSubmission;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", dsubmission=" + dsubmission + ", tSubmission=" + tSubmission + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}';
    }
    

    

    

   
    
    
   

   

   

   
    
} 