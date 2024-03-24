package StructuralDesignPatterns.BridgePattern.StudentManagerExample;

import java.util.ArrayList;
import java.util.List;

public class SchoolStudents implements Student
{
    private List<String> students = new ArrayList<String>();
    private int curr = 0;

    public SchoolStudents()
    {
        students.add("Student A");
        students.add("Student B");
        students.add("Student C");
        students.add("Student D");
        students.add("Student E");
        students.add("Student F");
    }

    @Override
    public void next()
    {
        if (curr <= students.size() + 1)
            curr++;

        System.out.println(curr);
    }

    @Override
    public void prev()
    {
        if (curr > 0)
            curr++;

        System.out.println(curr);
    }

    @Override
    public void newStudent(String s)
    {
        students.add(s);
    }

    @Override
    public void delete(String s)
    {
        students.remove(s);
    }

    @Override
    public void display()
    {
        System.out.println(students.get(curr));
    }

    @Override
    public void displayAll()
    {
        for (String s : students)
            System.out.println(s);
    }
}