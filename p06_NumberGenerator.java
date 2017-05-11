package final_exam_2017_05_07;

import java.util.Scanner;

public class p06_NumberGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = Integer.parseInt(console.nextLine());
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        int specialNum = Integer.parseInt(console.nextLine());
        int controlNum = Integer.parseInt(console.nextLine());


        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0 ; j--) {
                for (int k = l; k > 0 ; k--) {
                    int num = i*100 + j*10 + k;
                    if (num % 3 == 0){
                        specialNum += 5;
                    } else if (num % 10 == 5 && num % 3 != 0){
                        specialNum -= 2;
                    } else if (num % 2 == 0 && num % 10 != 5 && num % 3 != 0){
                        specialNum *= 2;
                    }
                    if (specialNum >= controlNum){
                        break;
                    }
                }
                if (specialNum >= controlNum){
                    break;
                }
            }
            if (specialNum >= controlNum){
                break;
            }
        }
        if (specialNum >= controlNum){
            System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNum);
        } else {
            System.out.printf("No! %d is the last reached special number.", specialNum);
        }
    }
}
