public class index {
    public static void main (String [] args) {
        XMLDataSoftware xmlDataSoftware = new XMLDataSoftware();
        XMLToJsonData xmlToJsonData = new XMLToJsonData(xmlDataSoftware);
        xmlToJsonData.jsonData();
    }
}


interface JsonData {
    public void jsonData();
}


class JSONDataSoftware implements JsonData{
    @Override
    public void jsonData() {
        System.out.println("Dislaying Json Data");
    }
}


interface XmlData {
    public void xmlData();
}
class XMLDataSoftware implements XmlData {
    @Override
    public void xmlData() {
        System.out.println("Displaying Xml Data");
    }
}

class XMLToJsonData implements JsonData {
    XMLDataSoftware xmlDataSoftware;

    XMLToJsonData(XMLDataSoftware xmlDataSoftware){
        this.xmlDataSoftware = xmlDataSoftware;
    }


    @Override
    public void jsonData() {
        xmlDataSoftware.xmlData();
    }
}