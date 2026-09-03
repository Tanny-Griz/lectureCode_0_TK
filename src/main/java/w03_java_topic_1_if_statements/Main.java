package w03_java_topic_1_if_statements;

import static input.InputUtils.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter today`s temperature in C");
        double temp = doubleInput();

        if (temp < 15) {
            System.out.println("Cold");
        } else {
            System.out.println("Good");
        }

        //
        double miles = doubleInput("How many miles do you live from MCTC? ");

        if (miles > 10) {
            System.out.println("You live more than 10 miles from MCTC");
        } else if (miles == 10) {
            System.out.println("You live exactly 10 miles from MCTC");
        } else {
            System.out.println("You live less than 10 miles from MCTC");
        }

        //
        double temp2 = doubleInput("What is the temperature?");
        int rain = intInput("How much rain? Enter 0 if there is no rain:");

        if (temp2 > 70 && rain == 0) {
            System.out.println("Warm and no rain - a nice day!");
        }
    }

}
