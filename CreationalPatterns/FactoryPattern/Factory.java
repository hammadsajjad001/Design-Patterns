package CreationalPatterns.FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factory {
    public static void main (String [] args) {
        GetFuelFactory getFuelFactory = new GetFuelFactory();
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter Fuel Type");
            Fuel f = getFuelFactory.getFuel(scan.readLine());
            f.getRate();

            double amount = Double.parseDouble(scan.readLine());
            System.out.println("The cost of fuel is: " + f.calcPrice(amount) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
abstract class Fuel {
    protected double rate;
    abstract void getRate();

    public double calcPrice (double amount){
        return rate * amount;
    }
}

class Petrol extends Fuel {

    void getRate (){
        rate = 280;
    }
}

class Diesel extends Fuel {

    void getRate() {
        rate = 150;
    }
}
class CNG extends Fuel {

    void getRate() {
        rate = 220;
    }
}

class GetFuelFactory{
   public Fuel getFuel(String fuelType){
       if(fuelType.equalsIgnoreCase("petrol")){
           return new Petrol();
       } else if (fuelType.equalsIgnoreCase("diesel")){
           return new Diesel();
       } else if (fuelType.equalsIgnoreCase("cng")) {
           return new CNG();
       }
       return null;
   }
}

