package CreationalPatterns.AbstractFactory;

class IphoneStore extends PhoneStore {
    public Phone createPhone (String modelName) {
        if(modelName.equals("Iphone11")){
            return new Iphone11();
        } else if (modelName.equals("IPhone12")) {
            return  new Iphone12();
        }
        return null;
    }
}