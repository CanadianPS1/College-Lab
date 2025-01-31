package College.models;
public class Faculty extends Student{
   private final String officeHours;
   private final boolean fullTime;
   public Faculty(String n, String bd, String sa, String oh, double gp, boolean ft, String c1, String c2, String c3, String c4){
    super(n, bd, sa, gp, c1, c2, c3, c4);
        officeHours = oh;
        fullTime = ft;
   }
   @Override
    public String toString(){
        return  "Name: " + name + "\n" +
                "Birthday: " + birthday + "\n" +
                "Office Room#: " + gpa + "\n" + 
                "Office Hours: " + officeHours + "\n" +
                "Full time status: " + fullTime + "\n" + 
                "Courses: " + courses;
    }
    
}
