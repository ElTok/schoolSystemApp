
package schoolsystemapp;




import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author elTok
 */
public class SchoolSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
            Scanner input = new Scanner(System.in); 
            
             
            ArrayList<Student> students = new ArrayList<>();
            ArrayList<Course> courses = new ArrayList<>(); 
            ArrayList<Trainer> trainers = new ArrayList<>(); 
            ArrayList<Assignment> assignments = new ArrayList<>();
            ArrayList<StudentsPerCourse> spc1 = new ArrayList<>();
            
            String choice;
            
            System.out.println("***School Entries***");
            do{
            input.nextLine();
         
            System.out.println("Enter first name: ");
            String firstName = input.nextLine();
            if (firstName.isEmpty()) {
               firstName = "John";
            }
            
            System.out.println("Enter last name: ");
            String lastName = input.nextLine();
            if (lastName.isEmpty()) {
                lastName = "Doe";
            }
            System.out.println("Enter date of birth with format dd/MM/yyyy: ");
            String dob = input.nextLine();
            
            SimpleDateFormat mybdate = new SimpleDateFormat("dd/MM/yyyy");
         
                 try {
                     Date date1 = mybdate.parse(dob);
                 } catch (ParseException ex) {
                     System.out.println("Invalid date!");
                     dob = "00/00/0000";
                 }
        
            System.out.println("Enter amount of tuition fees: ");
                Integer tuitionFees;   
                 try{
                   
             tuitionFees = Integer.parseInt(input.nextLine());
                 } catch (NumberFormatException a) {
                     System.out.println("Enter a number!");
                     tuitionFees = 2500;
                 }
            
            System.out.println("Enter course title: ");
            String title = input.nextLine();
            if (title.isEmpty()) {
                title = "Full-Stack Development";
            }
            System.out.println("Enter A for Java Stream or B for CSharp Stream: ");
            String stream =  input.nextLine();
            if (stream.equalsIgnoreCase("A")) {
                stream = "Java";
            }
            else if (stream.equalsIgnoreCase("B")) {
                stream = "Csharp";
            }
            else {
                stream = "Java";
            }
            System.out.println("Enter A for Full-Time or B for Part-Time: ");
            String type = input.nextLine();
            if (type.equalsIgnoreCase("A")) {
               type = "Full-Time";
            }
            else if (type.equalsIgnoreCase("B")) {
               type = "Part-Time";
            }
            else{
                type = "Full-Time";
            }
        
            System.out.println("Enter course start Date with format dd/MM/yyyy: ");
            String startDate = input.nextLine();
            SimpleDateFormat startdate = new SimpleDateFormat("dd/MM/yyyy");

                 try {
                     Date date2 = startdate.parse(startDate);
                 } catch (ParseException ex) {
                     System.out.println("Invalid date!");
                     startDate = "00/00/0000";
                 }
        
            System.out.println("Enter course end Date with format dd/MM/yyyy: ");
            String endDate = input.nextLine();
            SimpleDateFormat enddate = new SimpleDateFormat("dd/MM/yyyy");
                 try {
                     Date date3 = enddate.parse(endDate);
                 } catch (ParseException ex) {
                      System.out.println("Invalid date"); 
                      endDate = "00/00/00";
                 }
          
            System.out.println("Enter the name of the trainer: "); 
            String name = input.nextLine();
            if  (name.isEmpty()) {
            name = "Jane";
            }    
            System.out.println("Enter the last name of the trainer:");
            String last = input.nextLine();
            if  (last.isEmpty()) {
            last = "Doe";
            } 
            System.out.println("Enter subject: ");
            String subject = input.nextLine();
            if (subject.isEmpty()) {
            subject = "SubjectX";
            }
          
            System.out.println("Enter assignment title:");
            String assignment = input.nextLine();
            if (assignment.isEmpty()) {
            assignment = "AssignmentX";
            }
            
            System.out.println("Enter assignment description: ");
            String description = input.nextLine();
            if (description.isEmpty()) {
            description = "DescriptionX";
            }
            
            System.out.println("Enter date of submission with format dd/MM/yyyy: ");
            String dSubmission = input.nextLine();
            SimpleDateFormat ds = new SimpleDateFormat("dd/mm/yyyy");   
                 try {
                     Date date4 = ds.parse(dSubmission);
                 } catch (ParseException ex) {
                     System.out.println("Invalid date!");
                     dSubmission = "00/00/0000";
                 }
       
            System.out.println("Enter time of Submission with format hh:mm aa : ");
            String tSubmission = input.nextLine();
            DateFormat ts = new SimpleDateFormat("hh:mm aa");
             
                 try {
                     Date  date5 = ts.parse(tSubmission);
                 } catch (ParseException ex) {
                     System.out.println("Invalid time!");
                     tSubmission ="00:00 AM";
                 }
          
            
            System.out.println("Enter oral mark: ");
            Integer oralMark;
            try{
             oralMark = Integer.parseInt(input.nextLine());
            
            } catch (NumberFormatException s){
             
             oralMark = 60;
            
            }
             
            System.out.println("Enter total mark: ");
            Integer totalMark;
            try{
            totalMark = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException t){
                
                 totalMark= 65;
            }
                
         
            
            
            
            Student s = new Student(firstName,lastName,dob,tuitionFees);
            Course c = new Course(title,stream,type,startDate,endDate);
            Trainer t = new Trainer(name, last, subject);
            Assignment a = new Assignment(title, description, dSubmission, tSubmission, oralMark, totalMark);
           
            students.add(s);
            courses.add(c);
            trainers.add(t);
            assignments.add(a);
            
            
                
            
            
            
            
            
            StudentsPerCourse spc = new StudentsPerCourse(c,students);
            System.out.println( spc.toString());
            
            TrainersPerCourse tpc = new  TrainersPerCourse(c,trainers);
                System.out.println(tpc.toString());
                
            AssignmentsPerCourse apc = new AssignmentsPerCourse(c,assignments);
                System.out.println(apc.toString());
           
            AssignmentsPerStudent aps = new AssignmentsPerStudent(s,assignments); 
                System.out.println(aps.toString());
            
                spc1.add(spc);
 
           System.out.println("Continue Y/N: ");
           choice = input.next().toUpperCase();
           
           

        } while(choice.equals("Y"));  
            
           
            System.out.println(students);
          
            System.out.println(courses);
            
            System.out.println(trainers);
           
            System.out.println(assignments);
            
        System.out.println(spc1);
         
     
     
          
          
        

    }        
               
    
    
}
           
       
            

     
        
       
             
             
             
               

    
    
    

  


                    
                     
             
             
             
             
         
        
        
        

          
        
  
  
   
   
   
        
    

    

