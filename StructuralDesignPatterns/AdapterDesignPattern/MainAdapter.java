package StructuralDesignPatterns.AdapterDesignPattern;

public class MainAdapter {
    public static void main (String [] args) {
        XMLDataSoftware xmlDataSoftware = new XMLDataSoftware();
        JsonData xmlToJsonAdapter = new XMLToJsonAdapter(xmlDataSoftware);
        xmlToJsonAdapter.readJsonData();
    }
}