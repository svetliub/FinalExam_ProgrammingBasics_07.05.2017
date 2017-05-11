package final_exam_2017_05_07;

import java.util.Scanner;

public class p02_ToyShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double priceTrip = Double.parseDouble(console.nextLine());
        int puzzle = Integer.parseInt(console.nextLine());
        int doll = Integer.parseInt(console.nextLine());
        int bears = Integer.parseInt(console.nextLine());
        int minions = Integer.parseInt(console.nextLine());
        int trucks = Integer.parseInt(console.nextLine());
        int totalQuantity = puzzle + doll + bears + minions + trucks;
        double totalPrice = puzzle * 2.6 + doll * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;

        if (totalQuantity >= 50){
            totalPrice = totalPrice * 0.75;
        }
        totalPrice = totalPrice * 0.9;

        if (totalPrice >= priceTrip){
            System.out.printf("Yes! %.2f lv left.", (totalPrice - priceTrip));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (priceTrip - totalPrice));
        }


    }
}
