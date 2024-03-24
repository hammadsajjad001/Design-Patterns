package CreationalPatterns.FactoryPattern;
import java.util.Scanner;

public class Factory2 {
    public static void main (String [] args){
        String cardType = "";
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        double salary = sc.nextDouble();

        if(salary <= 50000){
            cardType = "Silver";
        } else if(salary <= 100000){
            cardType = "Gold";
        }else if (salary <= 500000){
            cardType = "Platinum";
        }

        CardType card = CardFactory.getCardType(cardType);
        System.out.println("Card Type : " + cardType);
    }
}

 abstract class CardType {
    protected double creditLimit;
    public abstract void setCredit();
    @Override
    public String toString() {
        return "Your Card is " + this.getClass().getSimpleName() + "And Your Credit Card Limit Is: " + creditLimit;
    }
}

class SilverCard extends CardType {
    public SilverCard(){
        setCredit();
    }

    public void setCredit() {
        creditLimit = 50000;
    }
}

class GoldCard extends CardType {
    public GoldCard(){
        setCredit();
    }

    public void setCredit() {
        creditLimit = 100000;
    }
}
class PlatinumCard extends CardType {
    public PlatinumCard(){
        setCredit();
    }

    public void setCredit() {
        creditLimit = 500000;
    }
}

class CardFactory {
    public static CardType getCardType(String type){
        switch (type){
            case "Silver":
                return  new SilverCard();
            case "Gold":
                return new GoldCard();
            case "Platinum":
                return new PlatinumCard();
            default:
                return null;
        }
    }
}

