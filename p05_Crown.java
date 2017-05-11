package final_exam_2017_05_07;

import java.util.Scanner;

public class p05_Crown {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int row = (2 * n) - 1;
        int high = n / 2 - 1;
        int dot = 1;
        int middleDot = 1;
        int space = row - 9;
        int asterisk = (row - n - 3)/2;

        System.out.printf("@%s@%s@%n", newString(" ", (row - 3)/2), newString(" ", (row - 3)/2));
        System.out.printf("**%s*%s**%n", newString(" ", (row - 5)/2), newString(" ", (row - 5)/2));

        for (int i = 0; i < high; i++) {
            if (i == high - 1){
                System.out.printf("*%s*%s*%s*%n", newString(".", dot), newString(".", middleDot),
                        newString(".", dot));
                break;
            }
            System.out.printf("*%s*%s*%s*%s*%s*%n", newString(".", dot), newString(" ", space/2), newString(".", middleDot),
                    newString(" ", space/2), newString(".", dot));
            dot++;
            middleDot += 2;
            space -= 4;
        }
        System.out.printf("*%s%s.%s%s*%n", newString(".", n/2), newString("*", asterisk), newString("*", asterisk),
                newString(".", n/2));
        System.out.printf("%s%n", newString("*", row));
        System.out.printf("%s%n", newString("*", row));

    }
    public static String newString (String text, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return  sb.toString();
    }
}
