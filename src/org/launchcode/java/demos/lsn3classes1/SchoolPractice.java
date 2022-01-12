package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
//        Student data = new Student();

//        data.setName("Evan");
//        data.setStudentId(01);
//        data.setNumberOfCredits(1);
//        data.setGpa(4.0);

        Student name = new Student("Evan",01,1,4.0 );

        System.out.println("Name: " + name.getName());
        System.out.println("Student ID: " + name.getStudentId());
        System.out.println("Number of credits: " + name.getNumberOfCredits());
        System.out.println("GPA: " + name.getGpa());
    }
}
