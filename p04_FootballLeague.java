package final_exam_2017_05_07;

import java.util.Scanner;

public class p04_FootballLeague {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int capacity = Integer.parseInt(console.nextLine());
        int numberOfFans = Integer.parseInt(console.nextLine());
        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 0; i < numberOfFans; i++) {
            String sector = console.nextLine();
            if (sector.equals("A")) {
                countA++;
            } else if (sector.equals("B")) {
                countB++;
            } else if (sector.equals("V")) {
                countV++;
            } else if (sector.equals("G")) {
                countG++;
            }
        }
        System.out.printf("%.2f%%%n", (countA * 100.0) / numberOfFans);
        System.out.printf("%.2f%%%n", (countB * 100.0) / numberOfFans);
        System.out.printf("%.2f%%%n", (countV * 100.0) / numberOfFans);
        System.out.printf("%.2f%%%n", (countG * 100.0) / numberOfFans);
        System.out.printf("%.2f%%%n", (numberOfFans * 100.0) / capacity);
    }
}
