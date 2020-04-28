package Robot;

import javax.swing.text.html.StyleSheet;
import java.util.Random;
import java.util.Scanner;

public class Killers {

    public static void main(String[] args) {
Navigation();
Killing();
Talking();

    }

    public static void Navigation() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Navigation, What you have in front?");
        System.out.println("Wall, Chair, Nothing");
        String surrounding = input.nextLine();
        boolean checkSur = true;
        while(checkSur)
            if(surrounding.equals("Wall")){
                System.out.println("The Robot is going Sideways");
                checkSur = false;
            }
            else if(surrounding.equals("Chair")){
                System.out.println("The Robot is Jumping");
                checkSur = false;
            }
            else if(surrounding.equals("Nothing")){
                System.out.println("Robot is Moving Forward");
                checkSur = false;
            }
            else {
                System.out.println("Navigate again");
               surrounding = input.nextLine();
               checkSur = true;
            }
    }

    public static void Killing() {

        System.out.println("Robot is searching for mouse!");
        System.out.println("How many pixel we have?");

            int battery = 4;
            boolean mouseFound = false;     // If the mouse if found or not
            boolean mouseHit = false;       // If the mouse is hit
            boolean batteryCheck = false;    // Does it have battery left


            Scanner input = new Scanner(System.in);
            int pixels = input.nextInt();

            // Mouse Find
        while (!mouseHit) {
            if ((pixels % 2) == 0) {
                mouseFound = true;
                System.out.println("Engaging the Mouse");
                // battery--;
            } else {
                System.out.println("Continuing Search");
                pixels = input.nextInt();
            }

            if ((battery > 0) && (mouseFound == true)) {
                Random rand = new Random();
                int stuffDestroy = rand.nextInt(10);

                    if (stuffDestroy == 5) {
                        System.out.println("Cannot hit, because of something in the way");
                        mouseHit = false;
                        System.out.println("Type Pixels for searching");
                        pixels = input.nextInt();
                    }
                    else {
                        mouseHit = true;
                        battery--;
                        System.out.println("Mouse is Killed");
                        System.out.println("Continue searching?  1.Yes  2.No ");

                        Scanner input2 = new Scanner(System.in);
                        String conSearch = input2.nextLine();

                        if (conSearch.equals("1")) {
                            if (battery == 0) {
                                batteryCheck = true;
                                //pixels = input.nextInt();
                            }
                            pixels = input.nextInt();
                            battery--;
                            mouseHit = false;

                        }
                        else {
                            System.out.println("Mission Accomplished");
                            batteryCheck = false;
                            }
                    }

                }

                while ((!batteryCheck) && (battery == 0)) {
                    System.out.println("Low Battery!");
                    Random rand = new Random();
                    int firstVariable = rand.nextInt(1000);
                    int secondVariable = rand.nextInt(1000);
                    if (firstVariable > secondVariable) {
                        System.out.println("Battery is Replenished");
                        battery = 4;
                        batteryCheck = true;
                        break;
                    }
                    else {
                        System.out.println("No Power to Replenish, Searching another source!");
                        batteryCheck = false;
                        battery = 0;
                    }
                }
            }
        }

    public static void Talking() {

        for(int number = 10;number>0;number--){
            while(number % 2 == 0){
                System.out.println( number + " ---> I am robotttt" );
                break;
            }
        }

    }
}
