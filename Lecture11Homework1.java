package homework;

import java.util.Scanner;

public class Lecture11Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int vowelsCount = 0;
        for(int a = 0; a < sentence.length(); a++){
            char vowels = sentence.charAt(a);
            if(vowels == 'a' || vowels =='A' || vowels == 'o' || vowels == 'O' || vowels == 'u' || vowels =='U' || vowels == 'e' || vowels =='E' || vowels == 'i' || vowels =='I'){
                vowelsCount++;
            }
        }
        System.out.println("The number of vowels is " + vowelsCount);
    }
}
