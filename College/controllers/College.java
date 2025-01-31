package College.controllers;

import College.models.Faculty;
import College.models.Staff;
import College.models.Student;
import java.util.ArrayList;


public class College {
    private final ArrayList<Faculty> faculty;
    private final ArrayList<Student> student;
    private final ArrayList<Staff> staff;
    private final ArrayList<Object> college;
    public College(){
        college = new ArrayList<>();
        student = new ArrayList<>();
        faculty = new ArrayList<>();
        staff = new ArrayList<>();
        faculty.add(new Student("Gatrick", "May 17th", null, 205, "cse100", "oop", "networking", "Foundations of AI").facultyMaker("9:00-5:00", true));
        faculty.add(new Student("Squillium", "Suptember 8th", null, 206, "cse100", "oop", "networking", null).facultyMaker("1:00-4:00", false));
        student.add(new Student("Lia", "May 24th", "Patrick", 4, "cse200", "networking", "project managment", "Math for compsci"));
        student.add(new Student("Jacob", "Novmeber 3rd", "Patrick", 3.5, "cse200", "networking", "project managment", "Math for compsci"));
        student.add(new Student("Lily", "October 5th", "Patrick", 3.8, "cse200", "networking", "project managment", "Math for compsci"));
        staff.add(new Student("Patrick", "August 6th", null, 0, "Lia", "Jacob", "Lily", null).staffMaker("Advocate"));
        staff.add(new Student("Mathue", "January 13th", null, 0, null, null, null, null).staffMaker("Advocate"));
        for(int i = 0; i < faculty.size(); i++){
            college.add(faculty.get(i));
        }
        System.out.println();
        for(int i = 0; i < staff.size(); i++){
            college.add(staff.get(i));
        }
        System.out.println();
        for(int i = 0; i < student.size(); i++){
            college.add(student.get(i));
        }

        
        for(int i = 0; i < college.size(); i++){
            System.out.println(college.get(i));
            System.out.println();
        }


        staff.get(0).setClasses(null,null,null,null);
        staff.get(1).setClasses("Lia", "Jacob", "Lily", null);
        student.get(0).setStaffAdd("Mathue");
        student.get(1).setStaffAdd("Mathue");
        student.get(2).setStaffAdd("Mathue");
        for(int i = 0; i < staff.size(); i++){
            System.out.println(staff.get(i));
        }
        System.out.println();
        for(int i = 0; i < student.size(); i++){
            System.out.println(student.get(i));
        }
        System.out.println();

        student.get(0).setClasses("cse200",null,null,null);
        System.out.println(student.get(0));
        System.out.println();

        faculty.get(1).setClasses(null, null, "networking", "Foundations of AI");
        System.out.println(faculty.get(1));
        System.out.println();


        int dummy = college.indexOf(faculty.get(1));
        college.remove(dummy - 1);
        faculty.remove(1);

        dummy = college.indexOf(student.get(2));
        college.remove(dummy);
        student.remove(2);

        dummy = college.indexOf(staff.get(1));
        college.remove(dummy - 1);
        staff.remove(1);



        for(int i = 0; i < college.size(); i++){
            System.out.println(college.get(i));
            System.out.println();
        }

    }


}
