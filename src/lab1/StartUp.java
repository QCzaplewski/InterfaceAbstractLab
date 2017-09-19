/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Quinten
 */
public class StartUp {
    public static void main(String[] args) {
        Course course1 = new IntroToProgrammingCourse("Intro To Programming","111-111", 1.0,"None");
        Course course2 = new IntroJavaCourse("Intro Java","222-222", 2.0,"Intro to Java Programming");
        Course course3 = new AdvancedJavaCourse("Advanced Java","333-333", 3.0,"Intro Java");
        
        Course[] courses = {course1, course2, course3};
        
        System.out.println("--------Test1--------");
        for(Course course : courses){
            System.out.println(course.getCourseName() + "- "
                    + "\n\tCourse Number: " + course.getCourseNumber() 
                    + "\n\tCredits: " + course.getCredits() 
                    + "\n\tPrerequisites: " + course.getPrerequisites());
        }
        
        course1.setCredits(1.5);
        course2.setCourseNumber("222-333");
        course3.setPrerequisites("Intro Java, Intro to Programming");
        
        System.out.println("\n--------Test2--------");
        for(Course course : courses){
            System.out.println(course.getCourseName() + "- "
                    + "\n\tCourse Number: " + course.getCourseNumber() 
                    + "\n\tCredits: " + course.getCredits() 
                    + "\n\tPrerequisites: " + course.getPrerequisites());
        }
        
        /*
            I think that the super class doesn't need to be abstract with the 
            way I did it. All of the classes use the setters the same so I did
            not have to make them abstract.
        */
    }
}
