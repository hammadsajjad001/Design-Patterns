package CreationalPatterns.AbstractFactory;

class OnePlusStore extends PhoneStore {
    public Phone createPhone (String modelName) {
        if(modelName.equals("OnePlus7")){
            return new OnePlus7();
        } else if (modelName.equals("OnePlus8")) {
            return  new OnePlus8();
        }
        return null;
    }
}