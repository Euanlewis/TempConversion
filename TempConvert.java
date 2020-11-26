import java.util.Scanner;

public class TempConvert {


            //The section of the code below is the main function which has the user input validation as well as the function that calls the method for either Celsius to Fahrenheit or Fahrenheit to Celsius and the exit function.
    public static void main (String args[]){
            //I have put all of the main method into a loop so that it can be exited at the end.
        boolean exit = false;
        while(!exit) {

            Scanner input = new Scanner(System.in);
            System.out.println("If you want to convert Celsius to Fahrenheit enter (1), or if you want to convert Fahrenheit to Celsius enter (2) ");

            int option = 0;
            boolean errorCheck;

            // The section below validates the user input to make sure its either 1 or 2.
            do {
                if (input.hasNextInt(1 | 2)) {
                    option = input.nextInt();
                    errorCheck = true;
                } else {
                    System.out.println("Error! Enter 1 or 2");
                    errorCheck = false;
                    input.next();
                }

            } while (!(errorCheck));


            //The section below calls either the celsiusToFahrenheit or fahrenheitToCelsius function.

            if (option == 1) {
                celsiusToFahrenheit();

            }
            if (option == 2) {
                fahrenheitToCelsius();
            }

            //In the section below is the exit function, I created another user input validation function and an if statement to either repeat the main method or exit it.
            Scanner exitInput = new Scanner(System.in);
            System.out.println("Do you wan to convert another temperature? Enter 1 for Yes or 2 for No");
            int exitOption = 0;
            boolean errorCheck2;

            do{
                if (exitInput.hasNextInt(1 | 2 )){
                    exitOption = exitInput.nextInt();
                    errorCheck2 = true;
                }else{
                    System.out.println("Error! Enter 1 or 2");
                    errorCheck2 = false;
                    exitInput.next();
                }

            }while (!(errorCheck2));

            if (exitOption == 1){
                exit = false;
            }
            if (exitOption == 2) {
                exit = true;
            }
        }
    }
        //The section below is the method to calculate Celsius to Fahrenheit.
    public static double celsiusToFahrenheit(){
        Scanner celsiusTemp = new Scanner(System.in);
        System.out.println("Input Celsius: ");
        double celsius = celsiusTemp.nextDouble();
        double fahrenheit = (((celsius * 9) / 5) + 32) ;;

        System.out.println(celsius + " Celsius is " + fahrenheit + " in Fahrenheit");

        return(fahrenheit);

    }
        //The section below is the method to calculate Fahrenheit to Celsius.
    public static double fahrenheitToCelsius(){
        Scanner fahrenheitTemp = new Scanner(System.in);
        System.out.println("Input Fahrenheit: ");
        double fahrenheit1 = fahrenheitTemp.nextDouble();
        double celsius1 = (((fahrenheit1 - 32) * 5) / 9) ;

        System.out.println(fahrenheit1 + " Fahrenheit is " + celsius1 + " in Celsius");

        return(celsius1);
    }

}


