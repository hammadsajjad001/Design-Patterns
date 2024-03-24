package StructuralDesignPatterns.BridgePattern.StudentManagerExample;
public class StudentFormat extends StudentManager
{
    public StudentFormat(String catalogue)  {super(catalogue);}
    public void displayAll()                {super.displayAll();}
}