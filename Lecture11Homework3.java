package homework;

import java.util.Scanner;

public class Lecture11Homework3 {
    static int PIN = 1234;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tryCode;
        System.out.println("Please enter PIN code: ");
        tryCode = scanner.nextInt();
        for(int i = 0; i <= 3; i++){
            if(tryCode == PIN && i < 3){
                System.out.println("Correct password, welcome back!");
            } else if(tryCode != PIN && i < 3){
                System.out.println("Incorrect password, please try again.");
                tryCode = scanner.nextInt();
            } else if(i >= 3){
                System.out.println("We apologize but you have exceeded the three attempts, your account is locked. Please contact an administrator.");
            }
        }
    }
}
