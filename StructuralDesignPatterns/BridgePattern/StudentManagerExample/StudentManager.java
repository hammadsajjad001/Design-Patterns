package StructuralDesignPatterns.BridgePattern.StudentManagerExample;
public class StudentManager
{
    protected Student s;
    public String catalogue;

    public StudentManager (String catalogue)    {this.catalogue = catalogue;}
    public void next()                          {s.next();}
    public void prev()                          {s.prev();}
    public void newStudent(String newStudent)   {s.newStudent(newStudent);}
    public void delete(String deleteStudent)    {s.delete(deleteStudent);}
    public void display()                       {s.display();}
    public void displayAll()                    {s.displayAll();}
}