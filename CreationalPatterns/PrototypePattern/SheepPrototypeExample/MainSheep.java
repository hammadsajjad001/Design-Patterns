package CreationalPatterns.PrototypePattern.SheepPrototypeExample;

public class MainSheep {
    public static void main (String [] args){
        Sheep blackSheep = new BlackSheep("Baa baa");
        Sheep whiteSheep = new WhiteSheep("Fleecy");

        Sheep clonedBlackSheep = blackSheep.clone();
        Sheep clonedWhiteSheep = whiteSheep.clone();

        clonedBlackSheep.setName("MidNight");
        clonedWhiteSheep.setName("SnowBall");

        System.out.println("Black sheep: " + clonedBlackSheep.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());
    }
}