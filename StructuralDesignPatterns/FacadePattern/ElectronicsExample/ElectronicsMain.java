package StructuralDesignPatterns.FacadePattern.ElectronicsExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public  class ElectronicsMain {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ElectronicsShop shop = new ElectronicsShop();
        System.out.println();
        System.out.println("Buy a device: ");
        System.out.println("1. Fridge");
        System.out.println("2. Washing Machine");
        System.out.println("3. TV");
        System.out.println();
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(br.readLine());
        if (choice == 1)        shop.sellFridge();
        else if (choice == 2)   shop.sellWashingMachine();
        else if (choice == 3)   shop.sellTV();
        else                    System.out.println("Wrong choice!");
    }
}