package final_exam_2017_05_07;

import java.util.Scanner;

public class p03_SchoolCamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine();
        String groupKind = console.nextLine();
        int numberKids = Integer.parseInt(console.nextLine());
        int numberNights = Integer.parseInt(console.nextLine());
        String sport = "";
        double price = 0.0;

        if (season.equals("Winter")){
            if (groupKind.equals("boys")){
                sport = "Judo";
                price = 9.6 * numberKids * numberNights;
            } else if (groupKind.equals("girls")){
                sport = "Gymnastics";
                price = 9.6 * numberKids * numberNights;
            } else if (groupKind.equals("mixed")){
                sport = "Ski";
                price = 10 * numberKids * numberNights;
            }
        }  else if (season.equals("Spring")){
            if (groupKind.equals("boys")){
                sport = "Tennis";
                price = 7.2 * numberKids * numberNights;
            } else if (groupKind.equals("girls")){
                sport = "Athletics";
                price = 7.2 * numberKids * numberNights;
            } else if (groupKind.equals("mixed")){
                sport = "Cycling";
                price = 9.5 * numberKids * numberNights;
            }
        } else if (season.equals("Summer")){
            if (groupKind.equals("boys")){
                sport = "Football";
                price = 15 * numberKids * numberNights;
            } else if (groupKind.equals("girls")){
                sport = "Volleyball";
                price = 15 * numberKids * numberNights;
            } else if (groupKind.equals("mixed")){
                sport = "Swimming";
                price = 20 * numberKids * numberNights;
            }
        }

        if (numberKids >= 50){
            price = price / 2;
        } else if (numberKids >= 20 && numberKids < 50){
            price = price * 0.85;
        } else if (10 <= numberKids && numberKids < 20){
            price = price * 0.95;
        }

        System.out.printf("%s %.2f lv.", sport, price);
    }
}
