
package schoolsystemapp;



/**
 *
 * @author elTok
 */
public class Trainer {
    
    private String name;
    private String last;
    private String subject;

    public Trainer(String name, String last, String subject) {
        this.name = name;
        this.last = last;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "name=" + name + ", last=" + last + ", subject=" + subject + '}';
    }
    
   
    
}
