package StructuralDesignPatterns.BridgePattern.StudentManagerExample;

public class BridgePatternDemo
{
    public static void main(String[] args)
    {
        StudentFormat studentFormat = new StudentFormat("Students of School XYZ");
        studentFormat.s = new SchoolStudents();

        System.out.println("Default list of students: ");
        studentFormat.displayAll();
        System.out.println();

        System.out.println("After adding new students: ");
        studentFormat.newStudent("Student X");
        studentFormat.newStudent("Student Y");
        studentFormat.newStudent("Student Z");
        studentFormat.displayAll();
        System.out.println();

        System.out.println("After deleting a student: ");
        studentFormat.delete("Student C");
        studentFormat.displayAll();
        System.out.println();
    }
}