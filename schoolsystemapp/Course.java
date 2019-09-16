
package schoolsystemapp;

/**
 *
 * @author elTok
 */
   public  class Course {

    
    private String title;
    private String stream;
    private String type;
    private String startDate;
    private String endDate;

    public Course(String title, String stream, String type, String startDate, String endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    

   

    

    

   
   }
   
   
    
    
   
    
    
    
