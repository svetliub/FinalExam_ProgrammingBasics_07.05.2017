package final_exam_2017_05_07;

import java.util.Scanner;

public class p01_Alcohol_exchange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double priceWhisky = Double.parseDouble(console.nextLine());
        double beerQuantity = Double.parseDouble(console.nextLine());
        double wineQuantity = Double.parseDouble(console.nextLine());
        double rakiaQuantity = Double.parseDouble(console.nextLine());
        double whiskyQuantity = Double.parseDouble(console.nextLine());

        double priseRakia = priceWhisky / 2;
        double priseWine = priseRakia * 0.6;
        double priseBeer = priseRakia * 0.2;

        double moneyNeeded = priceWhisky * whiskyQuantity + priseRakia * rakiaQuantity + priseWine * wineQuantity + priseBeer * beerQuantity;

        System.out.printf("%.2f", moneyNeeded);
    }
}
