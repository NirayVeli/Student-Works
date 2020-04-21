package Zadanie.informatics;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Main {

    public static void main(String[] args){
            Rectangle();
            MonthOfYear();
            suicide();
    }
// Homework Exercise 1
    public static void Rectangle(){
        int sideA = 2;
        int sideB = 6;
        int perimeterSum = 0;
        perimeterSum = (2*sideA) + (2*sideB);
        int areaSum = sideA * sideB;
        System.out.println("Zadacha 1: ");
        System.out.println("Perimeter is: " + perimeterSum);
        System.out.println("Area is: " + areaSum);
        System.out.println("--------------------------------------------------");
    }

// Homework Exercise 2
    public static void MonthOfYear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zadacha 2: ");
        System.out.println("Input Month: ");
        String monthName = input.nextLine();

        if(monthName.equals("January") ){
            System.out.println("January has 31 Days");
        }
        else if(monthName.equals("February") ){
            System.out.println("February has 28 Days");
        }
        else if(monthName.equals("March") ){
            System.out.println("March has 31 Days");
        }
        else if(monthName.equals("April") ){
            System.out.println("April has 30 Days");
        }
        else if(monthName.equals("May") ){
            System.out.println("May has 31 Days");
        }
        else if(monthName.equals("June") ){
            System.out.println("June has 30 Days");
        }
        else if(monthName.equals("July") ){
            System.out.println("July has 31 Days");
        }
        else if(monthName.equals("August") ){
            System.out.println("August has 31 Days");
        }
        else if(monthName.equals("September") ){
            System.out.println("September has 30 Days");
        }
        else if(monthName.equals("October") ){
            System.out.println("October has 31 Days");
        }
        else if(monthName.equals("November") ){
            System.out.println("November has 30 Days");
        }
        else if(monthName.equals("December") ){
            System.out.println("December has 31 Days");
        }
        else {
            System.out.println("Type Valid Month!");
        input.nextLine();}

    System.out.println("---------------------------------------------");
    }

    // Homework Exercise 3
    public static void suicide(){
        System.out.println("Zadacha 3: ");
        int apsFloor = 9;
        String girlNames = "Default";

    //I could add a timer, but i will stick to the things we learn and not use internet!

            switch (apsFloor){
                case 9:
                    girlNames = "Mimi";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 8:
                    girlNames = "Jana";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 7:
                    girlNames = "Elisabeth";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 6:
                    girlNames = "Maria";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 5:
                    girlNames = "Julia";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 4:
                    girlNames = "Gabriela";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 3:
                    girlNames = "Anabel";
                    apsFloor--;
                    System.out.println("Floor " + apsFloor +":" + " Hello " + girlNames + "!");

                case 2:
                    System.out.println("Auch!!!!!!");
            }
    }
}
