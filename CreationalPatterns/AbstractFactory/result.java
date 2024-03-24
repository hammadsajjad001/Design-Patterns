package CreationalPatterns.AbstractFactory;

public class result {
    public static void main (String [] args){
        PhoneStore IphoneStore = new IphoneStore();
        IphoneStore.orderphone("Iphone11");

        PhoneStore OnePlusStore = new OnePlusStore();
        OnePlusStore.orderphone("OnePlus8");

    }
}