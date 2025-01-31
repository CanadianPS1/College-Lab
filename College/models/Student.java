package College.models;

public class Student{
    protected String name, birthday;
    protected double gpa;
    private String staffAdd;
    protected String courses;
    protected static String course1;
    protected String course2;
    protected String course3;
    protected String course4;
    public Student(String n, String bD, String sa, double gp, String c1, String c2, String c3, String c4){
        name = n;
        birthday = bD;
        gpa = gp;
        staffAdd = sa;
        course1 = c1;
        course2 = c2;
        course3 = c3;
        course4 = c4;
        courses = new Course(c1,c2,c3,c4).getCourses();
    }
    public Faculty facultyMaker(String officeHours, boolean fullTime){
        Faculty fac = new Faculty(name, birthday, staffAdd, officeHours, gpa, fullTime, course1, course2, course3, course4);
        return fac;
    }
    public Staff staffMaker(String jobTitle){
        Staff staff = new Staff(name, birthday, staffAdd, gpa, course1, course2, course3, course4, jobTitle);
        return staff;
    }
    public String setClasses(String c1, String c2, String c3, String c4){
        courses = new Course(c1,c2,c3,c4).getCourses();
        return courses;
    }
    public String setStaffAdd(String sa){
        staffAdd = sa;
        return staffAdd;
    }
    @Override
    public String toString(){
        return  "Name: " + name + "\n" +
                "Birthday: " + birthday + "\n" +
                "GPA: " + gpa + "\n" + 
                "Staff Advisor: " + staffAdd + "\n" + 
                "Courses: " + courses;
    }
}
