package homework;

import java.util.Scanner;

public class Lecture11Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        //int reverse = 0;
        for(int i = 0; n > 0; i++){
            a = n % 10;
            n = n/10;
            //reverse = (reverse*10) + a;
            System.out.print(a);

        }
        //System.out.println(reverse);
    }
}

