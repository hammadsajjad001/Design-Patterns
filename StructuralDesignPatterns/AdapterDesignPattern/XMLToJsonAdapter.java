package StructuralDesignPatterns.AdapterDesignPattern;


public class XMLToJsonAdapter implements JsonData{
    XMLData xmlData;

    XMLToJsonAdapter(XMLData xmlData){
        this.xmlData = xmlData;
    }

    public void readJsonData () {
        xmlData.readXMLData();
        System.out.println("Convert here XML Data to Json Data");
    }
}