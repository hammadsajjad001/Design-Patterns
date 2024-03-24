package StructuralDesignPatterns.AdapterDesignPattern;

public interface XMLData{
    void readXMLData();
}

class XMLDataSoftware implements XMLData {
    @Override
    public void readXMLData() {
        System.out.println("Understands only XML Data");
    }
}
