package StructuralDesignPatterns.BridgePattern.StudentManagerExample;
public interface Student
{
    public void next();
    public void prev();
    public void newStudent(String s);
    public void delete(String s);
    public void display();
    public void displayAll();
}