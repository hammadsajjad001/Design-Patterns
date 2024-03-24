package CreationalPatterns.AbstractFactory;

public abstract class PhoneStore {
    public Phone orderphone(String modelName) {
        Phone phone ;
        phone = createPhone(modelName);
        phone.buildPhone();
        phone.assemblePhone();
        phone.packPhoneInBox();

        return phone;
    }

    abstract Phone createPhone(String modelName);

}