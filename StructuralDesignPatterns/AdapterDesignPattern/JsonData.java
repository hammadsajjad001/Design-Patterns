package StructuralDesignPatterns.AdapterDesignPattern;

public interface JsonData {
     void readJsonData();
}

class JsonDataSoftware implements JsonData{
    @Override
    public void readJsonData () {
        System.out.println("Understands only json data");
    }
}