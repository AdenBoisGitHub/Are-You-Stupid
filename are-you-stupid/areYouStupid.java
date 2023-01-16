import java.lang.Math.*;
import java.util.Scanner;

public class areYouStupid {
    public static void main(String[] args) {
        Scanner menuOptionScan = new Scanner(System.in);
        Scanner answer1Scan = new Scanner(System.in);
        System.out.print("ARE YOU STUPID? ");
        
        String menuOption = menuOptionScan.nextLine();
        
        if (menuOption.equals("PLAY")) {
            System.out.println("What is 2 + 2? ");
            
            int answer1 = answer1Scan.nextInt();
            
            
            if (answer1 == 4) {
                System.out.println("CONGRATULATIONS, YOU AREN'T STUPID!");
            }
            if (answer1 != 4) {
                System.out.println("CONGRATULATIONS, YOU'RE STUPID!");
            }
        }
    }
}