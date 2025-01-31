package College.models;

public class Staff extends Student{
    private final String jobTitle;
    public Staff(String n, String bD, String sa, double gp, String c1, String c2, String c3, String c4, String jt) {
        super(n, bD, sa, gp, c1, c2, c3, c4);
        jobTitle = jt;
    }
    
    @Override
    public String toString(){
        return  "Name: " + name + "\n" +
                "Birthday: " + birthday + "\n" +
                "Job Title: " + jobTitle + "\n" + 
                "Students: " + courses;
    }
}
