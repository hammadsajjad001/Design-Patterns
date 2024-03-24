package CreationalPatterns.AbstractFactory;
public abstract class  Phone {
    String brand;
    String modelName;
    String phoneSize;
    String bodytype;

    void buildPhone() {
        System.out.println("The brand of the phone is: " + brand);
        System.out.println("The model of the phone is:" + modelName);
        System.out.println("The size Of Phone Is :" + phoneSize);
        System.out.println("Body Type Of Phone is : " + bodytype);
    }

    void assemblePhone () {
        System.out.println("Assembling The Phone");
    }

    void packPhoneInBox () {
        System.out.println("Packing Phone In Box");
    }
}

