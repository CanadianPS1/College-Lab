package College.models;
public class Course{
    private final String course1, course2, course3, course4;
    private String courseCombo = "";
    public Course(String c1, String c2, String c3, String c4){
        course1 = c1;
        course2 = c2;
        course3= c3;
        course4 = c4;
    }
    public String getCourses(){
        courseCombo += " " + course1 + ",";
        courseCombo += " " + course2 + ",";
        courseCombo += " " + course3 + ",";
        courseCombo += " " + course4 + ",";

        return courseCombo;
    }
    
}
